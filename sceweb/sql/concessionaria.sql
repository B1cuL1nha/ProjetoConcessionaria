-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Banco sceweb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `sceweb` ;

-- -----------------------------------------------------
-- Banco sceweb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sceweb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `sceweb` ;

-- -----------------------------------------------------
-- Tabela Concessionaria
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sceweb`.`Concessionaria` ;

CREATE TABLE IF NOT EXISTS `sceweb`.`Concessionaria` (
  `placa` VARCHAR(8) NOT NULL COMMENT '',
  `marca` VARCHAR(45) NULL COMMENT '',
  `modelo` VARCHAR(45) NULL COMMENT '',
  `ano` VARCHAR(45) NULL COMMENT '',
  `cor` VARCHAR(45) NULL COMMENT '',
  `cambio` VARCHAR(45) NULL COMMENT '',
  `portas` VARCHAR(45) NULL COMMENT '',
  `combustivel` VARCHAR(45) NULL COMMENT '',
  `descricao` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`placa`)  COMMENT '')
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
