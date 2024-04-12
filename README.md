docker pull dpage/pgadmin4  
docker pull postgres  
docker ps  
docker container rm fd860cfdf8e0 -f  

#postgres setup  
docker run --name pg -e POSTGRES_USER=root -e POSTGRES_PASSWORD=pass -p 5432:5432 -d postgres  
docker run --name pgadmin-container -p 5050:80 -e PGADMIN_DEFAULT_EMAIL=a@b.com -e PGADMIN_DEFAULT_PASSWORD=pass -d dpage/pgadmin4  


H2: http://localhost:8080/h2-console  
Postgres: http://localhost:5050/
```
pom.xml --> postgres  
		<dependency>  
		  <groupId>org.postgresql</groupId>  
		  <artifactId>postgresql</artifactId>  
		  <scope>runtime</scope>  
		</dependency>  

pom.xml --> postgres     
    		<dependency>    
			<groupId>com.h2database</groupId>  
			<artifactId>h2</artifactId>  
			<scope>runtime</scope>  
		</dependency>  

#properties for postgres  
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres    
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect  
spring.datasource.username=root  
spring.datasource.password=pass  

#properties for h2  
spring.datasource.url=jdbc:h2:mem:testdb  
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect  
spring.datasource.username=sa  
spring.datasource.password=  
```
#common properties  
spring.jpa.show-sql=true  
spring.jpa.hibernate.ddl-auto=update  
spring.h2.console.enabled=true  


![image](https://github.com/learnspring2023/crud-demo/assets/137409193/a1e420fd-0092-456c-a984-9936aece77f7)
