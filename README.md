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


You will have to follow the given points to consume the API −

Autowired the Rest Template Object.
Use HttpHeaders to set the Request Headers.
Use HttpEntity to wrap the request object.
Provide the URL, HttpMethod, and Return type for Exchange() method.


--------------------------------------------------------------------------------------------------------

The REST application follows the REST architectural approach. We use the REST application for developing and designing networked applications. 
It generates the HTTP request that performs CRUD operations on the data. Usually, it returns data in JSON or XML format.

=====================================================================================================================================================
Stereotype Annotations
Spring Framework provides us with some special annotations. 
These annotations are used to create Spring beans automatically in the application context. 
@Component annotation is the main Stereotype Annotation. There are some Stereotype meta-annotations which is derived from @Component those are

@Service
@Repository
@Controller



1: @Service: We specify a class with @Service to indicate that they’re holding the business logic. Besides being used in the service layer, there isn’t any other special use for this annotation. The utility classes can be marked as Service classes.

2: @Repository: We specify a class with @Repository to indicate that they’re dealing with CRUD operations, usually, it’s used with DAO (Data Access Object) or Repository implementations that deal with database tables.

3: @Controller: We specify a class with @Controller to indicate that they’re front controllers and responsible to handle user requests and return the appropriate response. It is mostly used with REST Web Services.


=====================================================================================================================================================================================
HTTP Methods
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
@RequestMapping: 

It is used to map the web requests. It has many optional elements like consumes, header, method, name, params, path, produces, and value. 
We use it with the class as well as the method.

@GetMapping: It maps the HTTP GET requests on the specific handler method. 
It is used to create a web service endpoint that fetches It is used instead of using: @RequestMapping(method = RequestMethod.GET)


=================================================================================================================================================