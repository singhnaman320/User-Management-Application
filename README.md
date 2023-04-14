
<h1 align="center">[] User Management Application []</h1>
<h2>Project Overview:</h2>
<p align="justify"> User Management Application is providing user authentication by implementing the Java Spring Security module and once the user login, they will be redirected to their account page where the user can see their details by using Thymeleaf. 

<h2>Main Features:</h2>
The main features developed in this application are as follows:</p>

<h4>[] Register Module :</h4>
<h4>[] Login Module :</h4>
<h4>[] Home Module  :</h4>
<h4>[] User Module  :</h4>
<hr>

<h2>Tech-Stacks and Tools:</h2>
<table width = 100%>
<tbody>
<tr valign="top">
<td width="30%" align="center">
<h3 dir="auto"><span>Spring Tool Suite</span><br><br></h3>
<a><img src="https://github.com/singhnaman320/Insurance-Management-System/blob/master/Application%20PNG/spring%20Tool%20Suite.jpg?raw=true" height = "80" width = "80"></a>
</td>
<td width="30%" align="center">
<h3 dir="auto"><span>JAVA</span><br><br></h3>
<a><img src="https://github.com/singhnaman320/Insurance-Management-System/blob/master/Application%20PNG/java.png?raw=true" height = "80" width = "80"></a>
</td>
<td width="30%" align="center">
<h3 dir="auto"><span>MySQL</span><br><br></h3>
<a><img src="https://github.com/singhnaman320/Insurance-Management-System/blob/master/Application%20PNG/MySQL.png?raw=true" height = "80" width = "80"></a>
</td>
<td width="30%" align="center">
<h3 dir="auto"><span>SpringBoot</span><br><br></h3>
<a><img src="https://github.com/singhnaman320/Insurance-Management-System/blob/master/Application%20PNG/SpringBoot.png?raw=true" height = "80" width = "80"></a>
</td>
<td width="30%" align="center">
<h3 dir="auto"><span>Maven</span><br><br></h3>
<a><img src="https://github.com/singhnaman320/Insurance-Management-System/blob/master/Application%20PNG/Maven.png?raw=true" height = "80" width = "80"></a>
</td>
<td width="30%" align="center">
<h3 dir="auto"><span>Hibernate</span><br><br></h3>
<a><img src="https://github.com/singhnaman320/Insurance-Management-System/blob/master/Application%20PNG/Hibernate.png?raw=true" height = "80" width = "80"></a>
</td>
<td width="30%" align="center">
<h3 dir="auto"><span>Thymeleaf</span><br><br></h3>
<a><img src="https://github.com/singhnaman320/User-Management-Application/blob/master/User%20PNG/thymeleaf.png?raw=true" height = "80" width = "80"></a>
</td>
</tr>
</td>
</tr>
</tbody>
</table>

<hr>

<h2>Application Structure:</h2>
<img src="https://github.com/singhnaman320/User-Management-Application/blob/master/User%20PNG/Folder%20structure.png?raw=true">
<hr>

 <h2 id="installation-run">Installation &amp; Run</h2>
    <ul>
        <li>Step-1: Before running the REST API server(example: Tomcat), update the database configuration inside the <a href="https://github.com/singhnaman320/Insurance-Management-System/blob/master/InsuranceManagementSystem/src/main/resources/application.properties">application.properties</a>
            file.</li>
        <li>Step-2: Update your port number, database name, username and password as per required configuration.</li>
        <li>NOTE: Taking the same database name is not important as here database specific properties are dynamic in nature. If you want to take a different database name then also your application will work fine.</li>
        <li>Step-3: Start the server by running SpringBoot application.</li>
        <li>Step-4: Use http://localhost:8088/ to board on home page.</li>
        <li>Step-5: Try out the facilities provided.</li>
    </ul>
    <pre>
        <code>
            #changing the server port
            server.port=<span class="hljs-number">8088</span>
            <br>
            #database specific properties
            spring<span>.datasource</span><span>.url</span>=jdbc:mysql:<span>//${DB_HOST:localhost}:${DB_PORT:3306}/${DB_NAME:InsuranceManagementDatabase};</span>
            spring<span>.datasource</span><span>.driver-class-name</span>=com<span>.mysql</span><span>.cj</span><span>.jdbc</span><span>.Driver</span>
            spring<span>.datasource</span><span>.username</span>=${DB_USERNAME:root}
            spring<span>.datasource</span><span>.password</span>=${DB_PASSWORD:King@32911}
            <br>
            #ORM s/w specific properties
            spring<span>.jpa</span><span>.hibernate</span><span>.ddl-auto</span>=update
            spring<span>.jpa</span><span>.show-sql</span>=true
            <br>
            #For handling exception in validation
            spring<span>.mvc</span><span>.throw</span><span>-exception</span><span>-if</span><span>-no</span><span>-handler</span><span>-found</span><span>=true</span>
            spring<span>.web</span><span>.resources</span><span>.add</span><span>-mappings</span>=false
            <br>
            #Configure our own username and password
            spring<span>.security</span><span>.user</span><span>.name</span>=naman
            spring<span>.security</span><span>.user</span><span>.password</span>=123
            <br>
        </code>
    </pre>
    

