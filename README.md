# CouponServices

#Description
This coupon services used by Create Product which provide coupon to discount on the product..



#Technology
Java,spring-data-jpa,springWeb,spring-security,junit
#Database.
Mysql
#Tools
Spring-tool-suite,postman
#projectmanagement
Apache Maven

#VC
Git
======================================================================================================================================================

#RestTemplate

Rest Template is used to create applications that consume RESTful Web Services. 

You can use the exchange() method to consume the web services for all HTTP methods. 


#You will have to follow the given points to consume the API −

1) Autowired the Rest Template Object.
2) Use HttpHeaders to set the Request Headers.
3) Use HttpEntity to wrap the request object.
4) Provide the URL, HttpMethod, and Return type for Exchange() method.


--------------------------------------------------------------------------------------------------------

The REST application follows the REST architectural approach. We use the REST application for developing and designing networked applications. 
It generates the HTTP request that performs CRUD operations on the data. Usually, it returns data in JSON or XML format.

=====================================================================================================================================================
#Stereotype Annotations

Spring Framework provides us with some special annotations. 
These annotations are used to create Spring beans automatically in the application context. 
@Component annotation is the main Stereotype Annotation. There are some Stereotype meta-annotations which is derived from @Component those are

1) @Service
2) @Repository
3) @Controller



1: @Service: We specify a class with @Service to indicate that they’re holding the business logic. Besides being used in the service layer, there isn’t any other special use for this annotation. The utility classes can be marked as Service classes.

2: @Repository: We specify a class with @Repository to indicate that they’re dealing with CRUD operations, usually, it’s used with DAO (Data Access Object) or Repository implementations that deal with database tables.

3: @Controller: We specify a class with @Controller to indicate that they’re front controllers and responsible to handle user requests and return the appropriate response. It is mostly used with REST Web Services.


=====================================================================================================================================================================================
# HTTP Methods
For HTTP/1.1, the set of common methods are defined below. This set can be expanded based on the requirements. The name of these methods is case sensitive, and they must be used in uppercase.

Method and Description
i) GET

This method retrieves information from the given server using a given URI. 
GET request can retrieve the data. It can not apply other effects on the data.

ii) HEAD
This method is the same as the GET method. It is used to transfer the status line and header section only.

iii) POST

The POST request sends the data to the server. For example, file upload, customer information, etc. using the HTML forms.


iv) PUT

The PUT method is used to replace all the current representations of the target resource with the uploaded content.

v) DELETE

The DELETE method is used to remove all the current representations of the target resource, which is given by URI.

vi) CONNECT

This method establishes a tunnel to the server, which is identified by a given URI.

vii) OPTIONS

This method describes the options of communication for the target resource.


=============================================================================================================================================
# Spring and spring boot annotation:

@RequestMapping: 

1) It is used to map the web requests. 
2) It has many optional elements like consumes, header, method, name, params, path, produces, and value. 
We use it with the class as well as the method.

@GetMapping: 
1) It maps the HTTP GET requests on the specific handler method. 
2) It is used to create a web service endpoint that fetches It is used instead of using: @RequestMapping(method = RequestMethod.GET)

@PostMapping: 
1) It maps the HTTP POST requests on the specific handler method. 
2) It is used to create a web service endpoint that creates It is used instead of using: @RequestMapping(method = RequestMethod.POST)

@PutMapping: 
1) It maps the HTTP PUT requests on the specific handler method. 
2) It is used to create a web service endpoint that creates or updates It is used instead of using: @RequestMapping(method = RequestMethod.PUT)
@DeleteMapping: It maps the HTTP DELETE requests on the specific handler method. It is used to create a web service endpoint that deletes a resource. It is used instead of using: @RequestMapping(method = RequestMethod.DELETE)
@PatchMapping: It maps the HTTP PATCH requests on the specific handler method. It is used instead of using: @RequestMapping(method = RequestMethod.PATCH)


=================================================================================================================================================
@RequestBody: 
1) It is used to bind HTTP request with an object in a method parameter. 
2) Internally it uses HTTP MessageConverters to convert the body of the request. 
3) When we annotate a method parameter with @RequestBody, the Spring framework binds the incoming HTTP request body to that parameter.

@ResponseBody: It binds the method return value to the response body. 
It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.
@PathVariable: It is used to extract the values from the URI. It is most suitable for the RESTful web service, where the URL contains a path variable. We can define multiple @PathVariable in a method.

@RequestParam: It is used to extract the query parameters form the URL. It is also known as a query parameter. 
It is most suitable for web applications. It can specify default values if the query parameter is not present in the URL.
@RequestHeader: It is used to get the details about the HTTP request headers. We use this annotation as a method parameter. 
The optional elements of the annotation are name, required, value, defaultValue. For each detail in the header, we should specify separate annotations. 
We can use it multiple time in a method

==================================================================================================================================================
@RestController: 
1) It can be considered as a combination of @Controller and @ResponseBody annotations. 
2) The @RestController annotation is itself annotated with the @ResponseBody annotation. 
3) It eliminates the need for annotating each method with @ResponseBody.

@RequestAttribute: 
1) It binds a method parameter to request attribute. It provides convenient access to the request attributes from a controller method.
2) With the help of @RequestAttribute annotation, we can access objects that are populated on the server-side.
 
 =========================================================================================================================================================================
 
 #Junit Testing
 
1) JUnit tutorial provides basic and advanced concepts of unit testing in java with examples.
 
2) It is an open-source testing framework for java programmers. The java programmer can create test cases and test his/her own code.

3) It is one of the unit testing framework. Current version is junit 4.

4) To perform unit testing, we need to create test cases. The unit test case is a code which ensures that the program logic works as expected.

================================================================================================================================================================

#Types of unit testing

There are two ways to perform unit testing: 1) manual testing 2) automated testing.

1) Manual Testing
If you execute the test cases manually without any tool support, it is known as manual testing. It is time consuming and less reliable.

2) Automated Testing
If you execute the test cases by tool support, it is known as automated testing. It is fast and more reliable.

=================================================================================================================================================================

#Annotations for Junit testing

The Junit 4.x framework is annotation based, so let's see the annotations that can be used while writing the test cases.

@Test annotation specifies that method is the test method.

@Test(timeout=1000) annotation specifies that method will be failed if it takes longer than 1000 milliseconds (1 second).

@BeforeClass annotation specifies that method will be invoked only once, before starting all the tests.

=======================================================================================================================================================

@Before 
1) @Before annotation specifies that method will be invoked before each test.

@After 
2)@After  annotation specifies that method will be invoked after each test.

@AfterClass 
3) @AfterClass  annotation specifies that method will be invoked only once, after finishing all the tests.

======================================================================================================================================================
#Assert class
The org.junit.Assert class provides methods to assert the program logic.

# Methods of Assert class
The common methods of Assert class are as follows:

1) void assertEquals(boolean expected,boolean actual): checks that two primitives/objects are equal. It is overloaded.
2) void assertTrue(boolean condition): checks that a condition is true.
3) void assertFalse(boolean condition): checks that a condition is false.
4) void assertNull(Object obj): checks that object is null.
5) void assertNotNull(Object obj): checks that object is not null.


=======================================================================================================================================================
 # Example:

public class Calculation {  
  
    public static int findMax(int arr[]){  
        int max=0;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
}  

# Test Cases

import static org.junit.Assert.*;  
import com.javatpoint.logic.*;  
import org.junit.Test;  
  
public class TestLogic {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
} 

======================================================================================================================================================
