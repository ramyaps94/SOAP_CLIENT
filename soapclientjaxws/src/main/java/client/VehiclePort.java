
package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VehiclePort", targetNamespace = "http://parkinglot.com/vehicles")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VehiclePort {


    /**
     * 
     * @param getVehicleDetailsByIdRequest
     * @return
     *     returns client.GetVehicleDetailsByIdResponse
     */
    @WebMethod(operationName = "GetVehicleDetailsById")
    @WebResult(name = "GetVehicleDetailsByIdResponse", targetNamespace = "http://parkinglot.com/vehicles", partName = "GetVehicleDetailsByIdResponse")
    public GetVehicleDetailsByIdResponse getVehicleDetailsById(
        @WebParam(name = "GetVehicleDetailsByIdRequest", targetNamespace = "http://parkinglot.com/vehicles", partName = "GetVehicleDetailsByIdRequest")
        GetVehicleDetailsByIdRequest getVehicleDetailsByIdRequest);

    /**
     * 
     * @param getAllVehiclesRequest
     * @return
     *     returns client.GetAllVehiclesResponse
     */
    @WebMethod
    @WebResult(name = "getAllVehiclesResponse", targetNamespace = "http://parkinglot.com/vehicles", partName = "getAllVehiclesResponse")
    public GetAllVehiclesResponse getAllVehicles(
        @WebParam(name = "getAllVehiclesRequest", targetNamespace = "http://parkinglot.com/vehicles", partName = "getAllVehiclesRequest")
        GetAllVehiclesRequest getAllVehiclesRequest);

    /**
     * 
     * @param deleteVehicleRequest
     * @return
     *     returns client.DeleteVehicleResponse
     */
    @WebMethod
    @WebResult(name = "deleteVehicleResponse", targetNamespace = "http://parkinglot.com/vehicles", partName = "deleteVehicleResponse")
    public DeleteVehicleResponse deleteVehicle(
        @WebParam(name = "deleteVehicleRequest", targetNamespace = "http://parkinglot.com/vehicles", partName = "deleteVehicleRequest")
        DeleteVehicleRequest deleteVehicleRequest);

    /**
     * 
     * @param getVehicleDetailsByLicenseRequest
     * @return
     *     returns client.GetVehicleDetailsByLicenseResponse
     */
    @WebMethod(operationName = "GetVehicleDetailsByLicense")
    @WebResult(name = "GetVehicleDetailsByLicenseResponse", targetNamespace = "http://parkinglot.com/vehicles", partName = "GetVehicleDetailsByLicenseResponse")
    public GetVehicleDetailsByLicenseResponse getVehicleDetailsByLicense(
        @WebParam(name = "GetVehicleDetailsByLicenseRequest", targetNamespace = "http://parkinglot.com/vehicles", partName = "GetVehicleDetailsByLicenseRequest")
        GetVehicleDetailsByLicenseRequest getVehicleDetailsByLicenseRequest);

    /**
     * 
     * @param updateVehicleRequest
     * @return
     *     returns client.UpdateVehicleResponse
     */
    @WebMethod
    @WebResult(name = "updateVehicleResponse", targetNamespace = "http://parkinglot.com/vehicles", partName = "updateVehicleResponse")
    public UpdateVehicleResponse updateVehicle(
        @WebParam(name = "updateVehicleRequest", targetNamespace = "http://parkinglot.com/vehicles", partName = "updateVehicleRequest")
        UpdateVehicleRequest updateVehicleRequest);

    /**
     * 
     * @param addVehicleRequest
     * @return
     *     returns client.AddVehicleResponse
     */
    @WebMethod
    @WebResult(name = "addVehicleResponse", targetNamespace = "http://parkinglot.com/vehicles", partName = "addVehicleResponse")
    public AddVehicleResponse addVehicle(
        @WebParam(name = "addVehicleRequest", targetNamespace = "http://parkinglot.com/vehicles", partName = "addVehicleRequest")
        AddVehicleRequest addVehicleRequest);

}
