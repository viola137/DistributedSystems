-- db
--CREATE USER postgres WITH ENCRYPTED PASSWORD 'postgres';
--CREATE DATABASE distributed_systems;
--GRANT ALL PRIVILEGES ON DATABASE distributed_systems TO distributed_systems;

CREATE TABLE pets (id VARCHAR(36) NOT NULL, animal VARCHAR NOT NULL, breed VARCHAR NOT NULL, characteristics VARCHAR NOT NULL, issues VARCHAR NOT NULL, coats VARCHAR NOT NULL, size FLOAT NOT NULL, long_fur BOOLEAN NOT NULL, loud BOOLEAN NOT NULL, introverted BOOLEAN NOT NULL, intelligent BOOLEAN NOT NULL, PRIMARY KEY(id));

INSERT INTO pets (id, animal, breed, characteristics, issues, coats, size, long_fur, loud, introverted, intelligent) VALUES ('ce0236e9-781a-40c7-b63d-13e5a73826fc', 'Cat', 'Russian Blue', 'Elegant, calm, friendly good with children and other animals', 'Genetic health problems when not breed properly', 'blue, blue gray', 23, false, false, true, true), ('1000cbca-8f98-4116-8674-613efed07250', 'Cat', 'Somali', 'Loyal, affectionate and very interactive with their owners.', 'Can be prone to periodontal disease.', 'ruddy (florid), sorrel (chestnut), blue, fawn', 25, true, false, false, true), ('4b24e2bb-fb7f-43a1-ad67-987d1c237d94', 'Dog', 'Siberian Husky', 'Friendly, fastidous, graceful, get along with other animals and children.', 'Needs a lot of activity', 'agouti & white, black & white, gray & white, red & white, sable & white, brown & white, black tan & white, white, black', 55, true, true, false, true);
