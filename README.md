HowTheHell: Spring REST Web Service with XML
============================================

> _**This project is now retired**._
>
> _I created this project back in 2014 to be a reference for me and the community. I have long since stopped working with Java in general and Spring in particular._

As of version 4 of the Spring Framework, creating a web service that responds with JSON is very simple with Spring MVC ([tutorial][json-tutorial]). Yet, the same does not happen with XML.

This project aims to provide a sample configuration of such an web service, using [JAXB][jaxb] for marshalling.


## Building

To build this project, the best way would be using Maven:

```
mvn install
```

After running the command above, a `war` file should have been generated inside the `target` directory.


## Trying it out

After using your favorite servlet container (Tomcat recommended) to mount the application locally, simply access to `http://localhost:8080/hth-spring-rest-xml/greeting` and verify that the response is valid XML.

Should your container use a different port, or your context have any other name, remember to adapt the test url accordingly.


## License

Project released under the [MIT license][mit-license]. Please refer to the LICENSE.txt file at the root of the project for a complete copy.


[jaxb]: https://jaxb.java.net/tutorial/
[json-tutorial]: https://spring.io/guides/gs/rest-service/
[mit-license]: http://opensource.org/licenses/MIT
