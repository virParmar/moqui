Explaining the complete database setup

1. Install MySQL

2. Add JDBC Driver

Steps:

Download MySQL Connector/J 8.0.32 from MySQL JDBC Driver Download.

Copy the JAR file (e.g., mysql-connector-java-8.0.32.jar) to:

moqui/runtime/lib/

3. Create a Database

Steps:

Create the database:

CREATE DATABASE moqui CHARACTER SET utf8;

Create a new user and grant privileges:

CREATE USER 'moqui'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON moqui.* TO 'moqui'@'localhost';
FLUSH PRIVILEGES;

4. Update Moqui Configuration

Modify runtime/conf/MoquiDevConf.xml:

<default-property name="entity_ds_host" value="127.0.0.1"/>
<default-property name="entity_ds_port" value="3306"/>
<default-property name="entity_ds_database" value="moqui"/>
<default-property name="entity_ds_user" value="root"/>
<default-property name="entity_ds_password" value="password"/>

5. Load Data into Moqui

Run the data load command:

./gradlew load

6. Git Submission

git init
git remote add origin https://github.com/yourusername/moqui-training.git
git add runtime/conf/MoquiDevConf.xml README.md
git commit -m "Configured Moqui with MySQL"
git push origin main
