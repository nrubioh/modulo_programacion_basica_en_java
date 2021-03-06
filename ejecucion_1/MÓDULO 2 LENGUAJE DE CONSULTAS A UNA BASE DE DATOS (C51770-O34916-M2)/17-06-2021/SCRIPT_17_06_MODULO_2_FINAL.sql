-- MySQL Script generated by MySQL Workbench
-- Thu Jun 17 11:03:50 2021
-- Model: Sakila Full    Version: 2.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema new_schema1
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema new_schema1
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `new_schema1` ;
USE `new_schema1` ;

-- -----------------------------------------------------
-- Table `new_schema1`.`propiedades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `new_schema1`.`propiedades` (
  `idpropiedades` INT NOT NULL AUTO_INCREMENT,
  `tipo_propiedad` VARCHAR(45) NOT NULL,
  `dirección` VARCHAR(45) NULL,
  `comuna` VARCHAR(45) NULL,
  `precio` FLOAT NOT NULL,
  PRIMARY KEY (`idpropiedades`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `new_schema1`.`precio_dsco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `new_schema1`.`precio_dsco` (
  `idprecio_dsco` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(45) NOT NULL,
  `porcentaje` FLOAT NOT NULL,
  `propiedades_idpropiedades` INT NOT NULL,
  PRIMARY KEY (`idprecio_dsco`),
  INDEX `fk_precio_dsco_propiedades_idx` (`propiedades_idpropiedades` ASC),
  CONSTRAINT `fk_precio_dsco_propiedades`
    FOREIGN KEY (`propiedades_idpropiedades`)
    REFERENCES `new_schema1`.`propiedades` (`idpropiedades`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `new_schema1`.`corredor_propiedad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `new_schema1`.`corredor_propiedad` (
  `idcorredor_propiedad` INT NOT NULL AUTO_INCREMENT,
  `nombre_completo` VARCHAR(45) NULL,
  `celular` INT NULL,
  `edad` INT NULL,
  `email` VARCHAR(45) NULL,
  `direccion_particular` VARCHAR(45) NULL,
  PRIMARY KEY (`idcorredor_propiedad`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `new_schema1`.`propietario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `new_schema1`.`propietario` (
  `idpropietario` INT NOT NULL AUTO_INCREMENT,
  `nombre_completo` VARCHAR(45) NULL,
  `celular` INT NULL,
  `edad` INT NULL,
  `direccion_particular` VARCHAR(45) NULL,
  `corredor_propiedad_idcorredor_propiedad` INT NOT NULL,
  `propiedades_idpropiedades` INT NOT NULL,
  PRIMARY KEY (`idpropietario`),
  INDEX `fk_propietario_corredor_propiedad1_idx` (`corredor_propiedad_idcorredor_propiedad` ASC),
  INDEX `fk_propietario_propiedades1_idx` (`propiedades_idpropiedades` ASC),
  CONSTRAINT `fk_propietario_corredor_propiedad1`
    FOREIGN KEY (`corredor_propiedad_idcorredor_propiedad`)
    REFERENCES `new_schema1`.`corredor_propiedad` (`idcorredor_propiedad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_propietario_propiedades1`
    FOREIGN KEY (`propiedades_idpropiedades`)
    REFERENCES `new_schema1`.`propiedades` (`idpropiedades`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `new_schema1`.`arrendatario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `new_schema1`.`arrendatario` (
  `idarrendatario` INT NOT NULL AUTO_INCREMENT,
  `nombre_completo` VARCHAR(45) NULL,
  `celular` VARCHAR(45) NULL,
  `edad` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `corredor_propiedad_idcorredor_propiedad` INT NOT NULL,
  PRIMARY KEY (`idarrendatario`),
  INDEX `fk_arrendatario_corredor_propiedad1_idx` (`corredor_propiedad_idcorredor_propiedad` ASC),
  CONSTRAINT `fk_arrendatario_corredor_propiedad1`
    FOREIGN KEY (`corredor_propiedad_idcorredor_propiedad`)
    REFERENCES `new_schema1`.`corredor_propiedad` (`idcorredor_propiedad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


