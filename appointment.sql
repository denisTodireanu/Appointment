CREATE DATABASE appointmentdb;
CREATE USER postgres_user WITH PASSWORD 'postgres';
GRANT ALL PRIVILEGES ON DATABASE appointmentdb TO postgres_user;