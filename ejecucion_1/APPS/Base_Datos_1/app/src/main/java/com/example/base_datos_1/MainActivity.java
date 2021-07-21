package com.example.base_datos_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText et_codigo, et_descripcion, et_precio;
    private Spinner sp1;
    ArrayList<String>listaProductos;
    ArrayList<Producto>productsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_codigo = (EditText)findViewById(R.id.txt_codigo);
        et_descripcion = (EditText)findViewById(R.id.txt_descripcion);
        et_precio = (EditText)findViewById((R.id.txt_precio));
        sp1 = findViewById(R.id.sp);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>
                (this, android.R.layout.simple_spinner_item, listaProductos);
        sp1.setAdapter(adaptador);
        consultarListaProductos();
    }

    public void consultarListaProductos(){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper
                (this, "administracion", null, 1);
        SQLiteDatabase BaseDatabase5 = admin.getReadableDatabase();
        Producto p1 = new Producto();
        productsList = new ArrayList<Producto>();

        Cursor fila = BaseDatabase5.rawQuery("select * from producto", null);
        while(fila.moveToNext()){
            p1.setCodigo(fila.getInt(0));
            p1.setDescripcion(fila.getString(1));
            p1.setPrecio(fila.getInt(2));
            productsList.add(p1);
        }
    }
    public void obtenerProducto(){
        listaProductos = new ArrayList<String>();
        for(int i=0; i<productsList.size(); i++){
            listaProductos.add(productsList.get(i).getCodigo()+" - "
                    + productsList.get(i).getDescripcion() + productsList.get(i).getPrecio());
        }
    }
    public void Registrar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase BaseDatabase1 = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();
        String descripcion = et_descripcion.getText().toString();
        String precio = et_precio.getText().toString();

        if(!codigo.isEmpty() && !descripcion.isEmpty() && !precio.isEmpty()){
            ContentValues registro = new ContentValues();

            registro.put("codigo", codigo);
            registro.put("descripcion", descripcion);
            registro.put("precio", precio);

            BaseDatabase1.insert("articulos",null, registro);

            BaseDatabase1.close();
            et_codigo.setText("");
            et_descripcion.setText("");
            et_precio.setText("");

            Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(this, "Debes llenar los campos", Toast.LENGTH_LONG).show();
        }
    }
    //metodo
    public void Buscar(View view){

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase BaseDatabase2 = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();

        if(!codigo.isEmpty()){
            Cursor fila = BaseDatabase2.rawQuery
                    ("select descripcion, precio from articulos where codigo =" + codigo, null);
            if(fila.moveToFirst()){
                et_descripcion.setText(fila.getString(0));
                et_precio.setText(fila.getString(1));
                BaseDatabase2.close();

                Toast.makeText(this, "El articulo no existe", Toast.LENGTH_SHORT).show();
                BaseDatabase2.close();
            }
        } else{
            Toast.makeText(this, "Debes introducir el codigo de articulo", Toast.LENGTH_LONG).show();
        }
    }

    public void Delete(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper
                (this, "administracion", null , 1);
        SQLiteDatabase BaseDatabase3 = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();
        //para eliminar solo 1 art
        if(!codigo.isEmpty()){
            int cant = BaseDatabase3.delete("articulos", "codigo=" + codigo, null);
            BaseDatabase3.close();

            et_codigo.setText("");
            et_descripcion.setText("");
            et_precio.setText("");
        //cuando se elimina ese articulo ==1
            if(cant == 1){
                Toast.makeText(this, "El art. se elimino correctamente", Toast.LENGTH_LONG).show();
            } else{
                Toast.makeText(this,"El art. no existe", Toast.LENGTH_LONG).show();
            }
        } else{
            Toast.makeText(this,"Pone el cod del art.", Toast.LENGTH_SHORT).show();
        }
    }

    public void Mod(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper
                (this, "administracion", null, 1);
        SQLiteDatabase BaseDatabase4 = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();
        String descripcion = et_descripcion.getText().toString();
        String precio = et_precio.getText().toString();

        if(!codigo.isEmpty() && !descripcion.isEmpty() && !precio.isEmpty()){

            ContentValues registro = new ContentValues();
            registro.put("codigo", codigo);
            registro.put("descripcion", descripcion);
            registro.put("precio", precio);

            int cant = BaseDatabase4.update
                    ("articulos", registro, "codigo= " + codigo, null);
            BaseDatabase4.close();

            if(cant == 1){
                Toast.makeText(this, "El art. se modifico correctamente", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(this, "El art. no existe", Toast.LENGTH_SHORT).show();
            }
        } else{
            Toast.makeText(this, "Llena los espacios vacios", Toast.LENGTH_SHORT).show();
        }
    }
}
