-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema stockdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema stockdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `stockdb` DEFAULT CHARACTER SET utf8mb4 ;
USE `stockdb` ;

-- -----------------------------------------------------
-- Table `stockdb`.`stock`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `stockdb`.`stock` (
  `idStock` INT(11) NOT NULL AUTO_INCREMENT,
  `codigo` INT(11) NULL DEFAULT NULL,
  `marca` VARCHAR(45) NULL DEFAULT NULL,
  `producto` VARCHAR(45) NULL DEFAULT NULL,
  `precio` INT(11) NULL DEFAULT NULL,
  `stock` VARCHAR(45) NULL DEFAULT NULL,
  `vendidos` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idStock`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
