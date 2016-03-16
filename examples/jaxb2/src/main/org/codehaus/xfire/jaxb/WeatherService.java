package org.codehaus.xfire.jaxb;
// START SNIPPET: service
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import net.webservicex.GetWeatherByZipCode;
import net.webservicex.GetWeatherByZipCodeResponse;

@WebService(name="WeatherServiceIntf", targetNamespace="http://www.webservicex.net")
public interface WeatherService
{
    @WebMethod
    GetWeatherByZipCodeResponse GetWeatherByZipCode(@WebParam(name="GetWeatherByZipCode") GetWeatherByZipCode body);
}
// END SNIPPET: service