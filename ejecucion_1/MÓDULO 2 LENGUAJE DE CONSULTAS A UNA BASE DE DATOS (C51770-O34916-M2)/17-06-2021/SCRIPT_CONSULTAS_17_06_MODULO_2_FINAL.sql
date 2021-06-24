SELECT*FROM corredor_propiedad;

SELECT*FROM propiedades;
SELECT idpropiedades,CONCAT(tipo_propiedad,'',dirección) FROM propiedades;

select*from propiedades where precio>=200 and precio<=400;
select*from propiedades where precio between 200 and 700;

SELECT*FROM arrendatario where celular like '%4%';

SELECT*FROM arrendatario order by nombre_completo asc;
SELECT*FROM propietario group by edad;
SELECT avg(edad) from propietario;

SELECT SUM(precio) from propiedades;

SELECT propiedades.tipo_propiedad, propiedades.dirección, propiedades.precio, precio_dsco.porcentaje, precio_dsco.codigo
from propiedades
inner join precio_dsco
on  propiedades.idpropiedades= precio_dsco.propiedades_idpropiedades;










