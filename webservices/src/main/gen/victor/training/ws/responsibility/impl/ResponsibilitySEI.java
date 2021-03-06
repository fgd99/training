
package victor.training.ws.responsibility.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import victor.training.ws.responsibility.impl.messages.GetUserResponsibilityRequest;
import victor.training.ws.responsibility.impl.messages.GetUserResponsibilityResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ResponsibilitySEI", targetNamespace = "http://training.victor/ws/responsibility/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    victor.training.ws.responsibility.impl.dto.ObjectFactory.class,
    victor.training.ws.responsibility.impl.messages.ObjectFactory.class
})
public interface ResponsibilitySEI {


    /**
     * 
     * @param parameters
     * @return
     *     returns victor.training.ws.responsibility.impl.messages.GetUserResponsibilityResponse
     */
    @WebMethod(action = "http://training.victor/responsibility/GetUserResponsibility")
    @WebResult(name = "getUserResponsibilityResponse", targetNamespace = "http://training.victor/ws/responsibility/v1/messages", partName = "parameters")
    public GetUserResponsibilityResponse getUserResponsibility(
        @WebParam(name = "getUserResponsibilityRequest", targetNamespace = "http://training.victor/ws/responsibility/v1/messages", partName = "parameters")
        GetUserResponsibilityRequest parameters);

}
