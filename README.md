<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.cn</groupId>
  <artifactId>spring-boot</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>spring-boot</name>
  <url>http://maven.apache.org</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <shiro.version>1.3.2</shiro.version>
    <kaptcha.version>0.0.9</kaptcha.version>
  </properties>
  <parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.5.9.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
  </parent>
  <dependencies>
 	<!-- es整合开始 -->
  	 <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-elasticsearch</artifactId>
    </dependency>
    <dependency>
        <groupId>net.java.dev.jna</groupId>
        <artifactId>jna</artifactId>
        <version>3.0.9</version>
    </dependency>
    <!-- es整合结束 -->
    <!-- mybatisplugin开始 -->
<!--     		<dependency>
			<groupId>com.baomidou</groupId>
			<artifactId>mybatisplus-spring-boot-starter</artifactId>
			<version>1.0.5</version>
		</dependency>
     <dependency>
	    <groupId>com.baomidou</groupId>
	   <artifactId>mybatis-plus</artifactId>
	    <version>1.3.1</version>
    </dependency>  -->
     <!-- mybatisplugin结束 -->
     <!--liquibase依赖开始-->
	    <dependency>
	        <groupId>org.liquibase</groupId>
	        <artifactId>liquibase-core</artifactId>
	        <version>3.5.3</version>
	    </dependency>
	    <dependency>
	        <groupId>com.alibaba</groupId>
	        <artifactId>druid</artifactId>
	        <version>1.0.24</version>
	    </dependency>
	  <!--liquibase依赖结束-->
	  <!--j2cache一级缓存echache二级缓存redis-->
      <dependency>
		  <groupId>net.oschina.j2cache</groupId>
		  <artifactId>j2cache-core</artifactId>
		  <version>1.3.0</version>
	 </dependency>
	 <!--j2cache一级缓存echache二级缓存redis-->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
    <!-- 分页插件开始 -->
    <dependency>
     <groupId>com.github.pagehelper</groupId>
     <artifactId>pagehelper</artifactId>
     <version>4.1.6</version>
    </dependency>
    <!-- 分页插件结束 -->
   <!--theamleaf对于springsecurity的支持
    <dependency>
         <groupId>org.thymeleaf.extras</groupId>
         <artifactId>thymeleaf-extras-springsecurity4</artifactId>
    </dependency>
     <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-security</artifactId>
    </dependency> -->
     <!-- 开发工具包 -->
     <dependency>
        <groupId>com.xiaoleilu</groupId>
        <artifactId>hutool-all</artifactId>
        <version>3.0.1</version>
     </dependency>
     <!-- 开发工具包 -->
     <!-- rabbitmq -->
     <dependency>
        <groupId>com.rabbitmq</groupId>
        <artifactId>amqp-client</artifactId>
        <version>3.6.6</version>
     </dependency>
     <!-- rabbitmq -->
     <!-- shiro -->
     <dependency>
			<groupId>org.apache.shiro</groupId>
			<artifactId>shiro-core</artifactId>
			<version>${shiro.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.shiro</groupId>
			<artifactId>shiro-spring</artifactId>
			<version>${shiro.version}</version>
		</dependency>
		<dependency>
			<groupId>com.github.axet</groupId>
			<artifactId>kaptcha</artifactId>
			<version>${kaptcha.version}</version>
        </dependency>
        <!-- shiro -->
  <!--    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
     <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-web</artifactId>
     </dependency>
    
     
      <dependency>  
            <groupId>org.springframework.boot</groupId>  
            <artifactId>spring-boot-devtools</artifactId>  
            <optional>true</optional>  
            <scope>true</scope>  
        </dependency>  
         <dependency>  
       <groupId>org.springframework.boot</groupId>  
       <artifactId>spring-boot-starter-data-jpa</artifactId>  
   </dependency> 
     <dependency>
            <groupId>org.springframework.data</groupId>
            <artifactId>spring-data-jpa</artifactId>
     </dependency> -->
     <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jdbc</artifactId>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.2.2</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.2.2</version>
		</dependency>
		<dependency>
			<groupId>org.mybatis.spring.boot</groupId>
			<artifactId>mybatis-spring-boot-starter</artifactId>
			<version>1.1.1</version>
		</dependency> 

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.21</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
		</dependency>
   	    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<optional>true</optional>
			<scope>true</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		
      
        <dependency>  
              <groupId>io.goeasy</groupId>  
              <artifactId>goeasy-sdk</artifactId>  
              <version>0.3.1</version>  
        </dependency> 
        <dependency>
			  <groupId>org.owasp.antisamy</groupId>
			  <artifactId>antisamy</artifactId>
			  <version>1.5.7</version>
		</dependency>
		 <!--  <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.2.8</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
            <version>1.2.2</version>
        </dependency> -->
  </dependencies>
  <build>
  	 <plugins>
          <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
            <!-- Maven Assembly Plugin -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-assembly-plugin</artifactId>
                <version>2.4.1</version>
                <configuration>
                    <!-- get all project dependencies -->
                    <descriptorRefs>
                        <descriptorRef>jar-with-dependencies</descriptorRef>
                    </descriptorRefs>
                    <!-- MainClass in mainfest make a executable jar -->
                    <archive>
                      <manifest>
                        <mainClass>com.lgp.SpringBoot.App</mainClass>
                      </manifest>
                    </archive>
 
                </configuration>
                <executions>
                  <execution>
                    <id>make-assembly</id>
                     <!-- bind to the packaging phase -->
                    <phase>package</phase> 
                    <goals>
                        <goal>single</goal>
                    </goals>
                  </execution>
                </executions>
            </plugin>
            
        </plugins>
  </build>
   <repositories>
   		 <repository>  
             <id>goeasy</id>  
             <name>goeasy</name>  
             <url>http://maven.goeasy.io/content/repositories/releases/</url>  
        </repository>  
        <repository>
            <id>spring-snapshots</id>
            <url>http://repo.spring.io/snapshot</url>
            <snapshots><enabled>true</enabled></snapshots>
        </repository>
        <repository>
            <id>spring-milestones</id>
            <url>http://repo.spring.io/milestone</url>
        </repository>
    </repositories>
    <pluginRepositories>
        <pluginRepository>
            <id>spring-snapshots</id>
            <url>http://repo.spring.io/snapshot</url>
        </pluginRepository>
        <pluginRepository>
            <id>spring-milestones</id>
            <url>http://repo.spring.io/milestone</url>
        </pluginRepository>
    </pluginRepositories>
</project>
