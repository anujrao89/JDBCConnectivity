# JDBC MYSQL Connectivity

Connecting to MYSQL through Java using JDBC

## Getting Started

These instructions will help you to Connect Java to MySql and also Retrieving/Insert data from/to the DB tables.

### Prerequisites

Following things are required to establish connectivity between Java and MySQL

```
1) MySQL's Type 4 JDBC driver which is bundled in mysql-connector-java-8.0.17.jar 
  (This can be downloaded from https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.17)
  For Maven you can include the following dependency: - 
  <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
  <dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.17</version>
  </dependency>
  
2) Database with table to demonstrate query (Cinema database with few movies in the database) 

3) JDBC URL for eg :- (jdbc:mysql://localhost:3306/test) 

4) Username ("root”) 

5) Password ("root”) 

```

### Place the mysql-connector-java-8.0.17.jar file in your classpath

Using IntelliJ IDEA:-
```
• Right click on the project ->Open Module Settings -> Libraries
• Click on the ‘+’ sign -> Java and then give the path of the jar file
• Click on Ok -> Apply -> Ok
```

Using Eclipse:-
```
• Right click on the project ->Properties -> Java Build Path
• Click on the Libraries tab and select classpath 
• Click Add External JARs and then give the path of the jar file
• Click on Apply and Close
```

For MAC:-
```
export CLASSPATH=$CLASSPATH:/Users/anujrao/Downloads/mysql-connector-java-8.0.17.jar
```

For Windows:-
```
• Select Start -> Control Panel -> System -> Advanced -> Environment Variables -> System Variables -> CLASSPATH.
• If the Classpath variable exists, prepend the path to the jar file  to the beginning of the CLASSPATH varible. Followed by ;
• If the CLASSPATH variable does not exist, select New. Type CLASSPATH for the variable name and give the path to the jar file
• Click OK three times.

```
For Plain Vanilla through command prompt:-
```
If you're doing it "plain vanilla" in the command console, then you need to specify the path to the JAR file in the -cp or -classpath argument when executing your Java application.
	java -cp .;/path/to/mysql-connector.jar com.example.YourClass
The . is just there to add the current directory to the classpath as well so that it can locate com.example.YourClass and the ; is the classpath separator as it is in Windows. In Unix and clones : should be used.

```

### You can find the Java code to select/insert/update or delete a record in MYSQL database using JDBC in the src folder

```
find below the path:-
https://github.com/anujrao89/JDBCConnectivity/tree/master/JDBC_CONNECTIVITY/src
```

