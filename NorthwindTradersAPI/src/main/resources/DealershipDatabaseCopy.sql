DROP DATABASE IF EXISTS CarDealership;

CREATE DATABASE IF NOT EXISTS CarDealership;

USE CarDealership;

# ---------------------------------------------------------------------- #
# Tables                                                                 #
# ---------------------------------------------------------------------- #
# ---------------------------------------------------------------------- #
# Add table "Dealerships"                                                #
# ---------------------------------------------------------------------- #

CREATE TABLE `Dealerships` (
    `DealershipID` INTEGER NOT NULL AUTO_INCREMENT,
    `Name` varchar(50),
    `Address` varchar(50),
    `Phone` varchar(12),
	CONSTRAINT `PK_Dealerships` PRIMARY KEY (`DealershipID`)
);


# ---------------------------------------------------------------------- #
# Add table "Vehicles"                                       #
# ---------------------------------------------------------------------- #
CREATE TABLE `Vehicles` (

    `VIN` INTEGER NOT NULL auto_increment,
	`VehicleMake` varchar(50),
    `VehicleModel` varchar(50),
    `Sold` varChar(3),
	CONSTRAINT `PK_VIN` primary KEY (`VIN`)
    
);
CREATE INDEX idx_vin ON Vehicles (VIN);




# ---------------------------------------------------------------------- #
# Add table "Inventory"                                                  #
# ---------------------------------------------------------------------- #

CREATE TABLE `Inventory` (
    `DealershipID` INTEGER NOT NULL,
    `VIN` INTEGER NOT NULL,
    `VehicleMake` varchar(50),
    `VehicleModel` varchar(50),
    
    
	FOREIGN KEY (`VIN`) REFERENCES Vehicles(`VIN`),
	FOREIGN KEY (`DealershipID`) REFERENCES Dealerships(`DealershipID`)
);

# ---------------------------------------------------------------------- #
# Add table "Sales Contracts"                                                  #
# ---------------------------------------------------------------------- #

CREATE TABLE `SalesContracts` (
	`VIN` INTEGER NOT NULL,
    `Date` VARCHAR(15) NOT NULL,
    `SalesContractID` INTEGER NOT NULL AUTO_INCREMENT,
    `ClientName` VARCHAR(40) NOT NULL,
    `CarMake` VARCHAR(30),
    `CarModel` VARCHAR(30),
	
    CONSTRAINT `PK_Dealerships` PRIMARY KEY (`SalesContractID`),
    FOREIGN KEY (`VIN`) REFERENCES Vehicles(`VIN`)
    
    
);


# ---------------------------------------------------------------------- #
# Add info into Tables                                             #
# ---------------------------------------------------------------------- #

INSERT INTO Dealerships VALUES(null,'Kasey Nolan','1311 Firewheel Lane', '123-456-7890');
INSERT INTO Dealerships VALUES(null,'Light Yagami','1234 Street Drive', '813-706-3744');
INSERT INTO Dealerships VALUES(null,'John Frederick','9830 MLK Drive', '923-390-1628');
INSERT INTO Dealerships VALUES(null,'Lisa Lohan','1495 Rocky Road', '707-274-8283');
INSERT INTO Dealerships VALUES(null,'Georgia Smith','9683 Green Grass Lane', '236-860-1111');
INSERT INTO Dealerships VALUES(null,'Sam Winchester','4527 Fireside Court', '918-012-1010');

INSERT INTO Vehicles (`VehicleMake`, `VehicleModel`, `Sold`) VALUES ('Toyota', 'Corolla', 'Yes');
INSERT INTO Vehicles (`VehicleMake`, `VehicleModel`, `Sold`) VALUES ('Honda', 'Civic', 'No');
INSERT INTO Vehicles (`VehicleMake`, `VehicleModel`, `Sold`) VALUES ('Ford', 'Mustang', 'Yes');
INSERT INTO Vehicles (`VehicleMake`, `VehicleModel`, `Sold`) VALUES ('Chevrolet', 'Malibu', 'No');
INSERT INTO Vehicles (`VehicleMake`, `VehicleModel`, `Sold`) VALUES ('Nissan', 'Altima', 'Yes');
INSERT INTO Vehicles (`VehicleMake`, `VehicleModel`, `Sold`) VALUES ('Mazda', 'Miata', 'Yes');


INSERT INTO Inventory (`DealershipID`, `VIN`, `VehicleMake`, `VehicleModel`) VALUES (1, 1, 'Toyota', 'Corolla');
INSERT INTO Inventory (`DealershipID`, `VIN`, `VehicleMake`, `VehicleModel`) VALUES (2, 2, 'Honda', 'Civic');
INSERT INTO Inventory (`DealershipID`, `VIN`, `VehicleMake`, `VehicleModel`) VALUES (3, 3, 'Ford', 'Mustang');
INSERT INTO Inventory (`DealershipID`, `VIN`, `VehicleMake`, `VehicleModel`) VALUES (4, 4, 'Chevrolet', 'Malibu');
INSERT INTO Inventory (`DealershipID`, `VIN`, `VehicleMake`, `VehicleModel`) VALUES (5, 5, 'Nissan', 'Altima');

INSERT INTO SalesContracts (`VIN`, `Date`, `ClientName`, `CarMake`, `CarModel`)
VALUES (1, '2024-06-15', 'John Doe', 'Toyota', 'Corrolla');
INSERT INTO SalesContracts (`VIN`, `Date`, `ClientName`, `CarMake`, `CarModel`)
VALUES (3, '2023-07-15', 'Nathan Angel', 'Ford', 'Mustang');
INSERT INTO SalesContracts (`VIN`, `Date`, `ClientName`, `CarMake`, `CarModel`)
VALUES (5, '2022-02-02', 'Mary Black', 'Nissan', 'Altima');
INSERT INTO SalesContracts (`VIN`, `Date`, `ClientName`, `CarMake`, `CarModel`)
VALUES (6, '2024-01-04', 'Prince Clark', 'Mazda', 'Miata');














































