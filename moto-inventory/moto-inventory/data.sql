-- Inserting into Manufacturer table
INSERT INTO manufacturer (manufacturer_id, name,location) VALUES (1, 'Yamaha', 'Hamamatsu, Shizuoka, Japan');
INSERT INTO manufacturer (manufacturer_id, name,location) VALUES (2, 'Honda', 'Minato, Tokyo, Japan');
INSERT INTO manufacturer (manufacturer_id, name,location) VALUES (3, 'Suzuki','Hamamatsu, Shizuoka, Japan');
INSERT INTO manufacturer (manufacturer_id, name,location) VALUES (4, 'Kawasaki','Minato, Tokyo, Japan');
INSERT INTO manufacturer (manufacturer_id, name,location) VALUES (5, 'Harley-Davidson','Milwaukee, Wisconsin, USA');

-- Inserting into Owner table
INSERT INTO owner (owner_id, name, address) VALUES (1, 'John Snyder', '123 Apple St, San Francisco, CA 94107, USA');
INSERT INTO owner (owner_id, name, address) VALUES (2, 'Jane Haskell', '456 Peach Ave, Atlanta, GA 30305, USA');
INSERT INTO owner (owner_id, name, address) VALUES (3, 'Alex Hall', '789 Cherry Ln, Traverse City, MI 49684, USA');
INSERT INTO owner (owner_id, name, address) VALUES (4, 'James Ta', '111 Orange Dr, Orlando, FL 32801, USA');
INSERT INTO owner (owner_id, name, address) VALUES (5, 'Anna Pitss', '222 Berry Blvd, Louisville, KY 40208, USA');
INSERT INTO owner (owner_id, name, address) VALUES (6, 'Mark Cowan', '333 Melon Way, Weatherford, TX 76086, USA');
INSERT INTO owner (owner_id, name, address) VALUES (7, 'Mary Jones', '444 Lemon Rd, Honolulu, HI 96816, USA');
INSERT INTO owner (owner_id, name, address) VALUES (8, 'David Bailey', '555 Grape Ct, Napa, CA 94558, USA');
INSERT INTO owner (owner_id, name, address) VALUES (9, 'Lisa Lee', '666 Pineapple Pl, Honolulu, HI 96820, USA');
INSERT INTO owner (owner_id, name, address) VALUES (10, 'Michael Rojas', '777 Strawberry St, Philadelphia, PA 19102, USA');

-- Inserting into Motorcycle table
INSERT INTO motorcycle (id, make, model, year, owner_id, manufacturer_id) VALUES (1, 'Yamaha', 'Sport', 2022, 1, 1);
INSERT INTO motorcycle(id, make, model, year, owner_id, manufacturer_id) VALUES  (2, 'Honda', 'Sport', 2021, 2, 2);
INSERT INTO motorcycle(id, make, model, year, owner_id, manufacturer_id) VALUES  (3, 'Suzuki', 'Sport', 2022, 3, 3);
INSERT INTO motorcycle(id, make, model, year, owner_id, manufacturer_id) VALUES  (4, 'Kawasaki', 'Sport', 2021, 4, 4);
INSERT INTO motorcycle(id, make, model, year, owner_id, manufacturer_id) VALUES  (5, 'Harley-Davidson', 'Cruiser', 2022, 5, 5);