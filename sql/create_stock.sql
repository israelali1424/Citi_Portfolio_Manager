CREATE TABLE `conygre`.`stocks` (
                                       `id` INT NOT NULL AUTO_INCREMENT,
                                       `symbol` VARCHAR(45) NOT NULL,
                                       `volume` INT NOT NULL,
                                       `price` DOUBLE NOT NULL,
                                       PRIMARY KEY (`id`),
                                       UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);