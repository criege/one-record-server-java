
package org.iata.api;

import org.semanticweb.owlapi.model.IRI;


/**
 * This class was generated by OWL2Java 0.13.3
 * 
 */
public class Vocabulary {

    public final static String ONTOLOGY_IRI_ = "http://cargo.iata.org/";
    public final static String ONTOLOGY_IRI_cargo_dot_iata_dot_org_generated = "http://cargo.iata.org-generated";
    public final static String s_c_Thing = "http://www.w3.org/2002/07/owl#Thing";
    public final static IRI c_Thing = IRI.create(s_c_Thing);
    public final static String s_c_AirWaybill = "http://cargo.iata.org/AirWaybill";
    public final static IRI c_AirWaybill = IRI.create(s_c_AirWaybill);
    /**
     * Audit trail of a Logistics Object
     * 
     */
    public final static String s_c_AuditTrail = "http://cargo.iata.org/AuditTrail";
    public final static IRI c_AuditTrail = IRI.create(s_c_AuditTrail);
    /**
     * Change Request for the audit trail
     * 
     */
    public final static String s_c_ChangeRequest = "http://cargo.iata.org/ChangeRequest";
    public final static IRI c_ChangeRequest = IRI.create(s_c_ChangeRequest);
    public final static String s_c_Company = "http://cargo.iata.org/Company";
    public final static IRI c_Company = IRI.create(s_c_Company);
    /**
     * Company information in the Internet of Logistics
     * 
     */
    public final static String s_c_CompanyInformation = "http://cargo.iata.org/CompanyInformation";
    public final static IRI c_CompanyInformation = IRI.create(s_c_CompanyInformation);
    /**
     * Create model for the audit trail
     * 
     */
    public final static String s_c_Create = "http://cargo.iata.org/Create";
    public final static IRI c_Create = IRI.create(s_c_Create);
    /**
     * Delegation Request to 3rd parties
     * 
     */
    public final static String s_c_DelegationRequest = "http://cargo.iata.org/DelegationRequest";
    public final static IRI c_DelegationRequest = IRI.create(s_c_DelegationRequest);
    /**
     * Error details
     * 
     */
    public final static String s_c_Details = "http://cargo.iata.org/Details";
    public final static IRI c_Details = IRI.create(s_c_Details);
    /**
     * Error model
     * 
     */
    public final static String s_c_Error = "http://cargo.iata.org/Error";
    public final static IRI c_Error = IRI.create(s_c_Error);
    /**
     * Event (status update) model
     * 
     */
    public final static String s_c_Event = "http://cargo.iata.org/Event";
    public final static IRI c_Event = IRI.create(s_c_Event);
    public final static String s_c_HouseWaybill = "http://cargo.iata.org/HouseWaybill";
    public final static IRI c_HouseWaybill = IRI.create(s_c_HouseWaybill);
    public final static String s_c_Location = "http://cargo.iata.org/Location";
    public final static IRI c_Location = IRI.create(s_c_Location);
    /**
     * Notification sent by the publisher to the subscriber
     * 
     */
    public final static String s_c_Notification = "http://cargo.iata.org/Notification";
    public final static IRI c_Notification = IRI.create(s_c_Notification);
    /**
     * Object to modify in the PATCH request
     * 
     */
    public final static String s_c_Object = "http://cargo.iata.org/Object";
    public final static IRI c_Object = IRI.create(s_c_Object);
    /**
     * Operation Request contained in the PATCH body
     * 
     */
    public final static String s_c_Operation = "http://cargo.iata.org/Operation";
    public final static IRI c_Operation = IRI.create(s_c_Operation);
    /**
     * PATCH Request body containing updates on a Logistics Object
     * 
     */
    public final static String s_c_PatchRequest = "http://cargo.iata.org/PatchRequest";
    public final static IRI c_PatchRequest = IRI.create(s_c_PatchRequest);
    /**
     * Subscription information sent to the publisher
     * 
     */
    public final static String s_c_Subscription = "http://cargo.iata.org/Subscription";
    public final static IRI c_Subscription = IRI.create(s_c_Subscription);
    /**
     * List of change requests that were sent as PATCH on for a Logitstics Object
     * 
     */
    public final static String s_p_changeRequests = "http://cargo.iata.org/AuditTrail#changeRequests";
    public final static IRI p_changeRequests = IRI.create(s_p_changeRequests);
    /**
     * Initial content of the Logistics Object at the creation moment
     * 
     */
    public final static String s_p_create = "http://cargo.iata.org/AuditTrail#create";
    public final static IRI p_create = IRI.create(s_p_create);
    /**
     * Non mandatory error details
     * 
     */
    public final static String s_p_error = "http://cargo.iata.org/AuditTrail#error";
    public final static IRI p_error = IRI.create(s_p_error);
    /**
     * PATCH body of a change request sent for a specific Logistics Object
     * 
     */
    public final static String s_p_changeRequest = "http://cargo.iata.org/ChangeRequest#changeRequest";
    public final static IRI p_changeRequest = IRI.create(s_p_changeRequest);
    /**
     * Company details
     * 
     */
    public final static String s_p_company = "http://cargo.iata.org/CompanyInformation#company";
    public final static IRI p_company = IRI.create(s_p_company);
    /**
     * Non mandatory error details
     * 
     */
    public final static String s_p_error_A = "http://cargo.iata.org/CompanyInformation#error";
    public final static IRI p_error_A = IRI.create(s_p_error_A);
    /**
     * Content of a Logistics Object
     * 
     */
    public final static String s_p_lo = "http://cargo.iata.org/Create#lo";
    public final static IRI p_lo = IRI.create(s_p_lo);
    /**
     * Error details
     * 
     */
    public final static String s_p_details = "http://cargo.iata.org/Error#details";
    public final static IRI p_details = IRI.create(s_p_details);
    /**
     * Geo position of where the event occurred
     * 
     */
    public final static String s_p_geo = "http://cargo.iata.org/Event#geo";
    public final static IRI p_geo = IRI.create(s_p_geo);
    /**
     * PATCH object to modify
     * 
     */
    public final static String s_p_o = "http://cargo.iata.org/Operation#o";
    public final static IRI p_o = IRI.create(s_p_o);
    /**
     * List of operations to apply as PATCH on a Logistics Object
     * 
     */
    public final static String s_p_operations = "http://cargo.iata.org/PatchRequest#operations";
    public final static IRI p_operations = IRI.create(s_p_operations);
    /**
     * Non mandatory error details
     * 
     */
    public final static String s_p_error_A_A = "http://cargo.iata.org/Subscription#error";
    public final static IRI p_error_A_A = IRI.create(s_p_error_A_A);
    /**
     * Logistics Object Reference for which the audit trail applies
     * 
     */
    public final static String s_p_logisticsObjectRef = "http://cargo.iata.org/AuditTrail#logisticsObjectRef";
    public final static IRI p_logisticsObjectRef = IRI.create(s_p_logisticsObjectRef);
    /**
     * Company which sent the change request
     * 
     */
    public final static String s_p_companyId = "http://cargo.iata.org/ChangeRequest#companyId";
    public final static IRI p_companyId = IRI.create(s_p_companyId);
    /**
     * ACCEPTED or REJECTED
     * 
     */
    public final static String s_p_status = "http://cargo.iata.org/ChangeRequest#status";
    public final static IRI p_status = IRI.create(s_p_status);
    /**
     * Timestamp of the change request
     * 
     */
    public final static String s_p_timestamp = "http://cargo.iata.org/ChangeRequest#timestamp";
    public final static IRI p_timestamp = IRI.create(s_p_timestamp);
    /**
     * Endpoint of the company in the Internet of Logistics
     * 
     */
    public final static String s_p_serverEndpoint = "http://cargo.iata.org/CompanyInformation#serverEndpoint";
    public final static IRI p_serverEndpoint = IRI.create(s_p_serverEndpoint);
    /**
     * Supported content types of the server
     * 
     */
    public final static String s_p_supportedContentTypes = "http://cargo.iata.org/CompanyInformation#supportedContentTypes";
    public final static IRI p_supportedContentTypes = IRI.create(s_p_supportedContentTypes);
    /**
     * Supported logistics object types on the server
     * 
     */
    public final static String s_p_supportedLogisticsObjects = "http://cargo.iata.org/CompanyInformation#supportedLogisticsObjects";
    public final static IRI p_supportedLogisticsObjects = IRI.create(s_p_supportedLogisticsObjects);
    /**
     * REVOKE or DELEGATE
     * 
     */
    public final static String s_p_action = "http://cargo.iata.org/DelegationRequest#action";
    public final static IRI p_action = IRI.create(s_p_action);
    /**
     * Party that receives the delegated rights
     * 
     */
    public final static String s_p_targetCompany = "http://cargo.iata.org/DelegationRequest#targetCompany";
    public final static IRI p_targetCompany = IRI.create(s_p_targetCompany);
    /**
     * Identifier of the logistics object to which the access is requested
     * 
     */
    public final static String s_p_targetLogisticsObject = "http://cargo.iata.org/DelegationRequest#targetLogisticsObject";
    public final static IRI p_targetLogisticsObject = IRI.create(s_p_targetLogisticsObject);
    /**
     * Field of the object for which the error applies
     * 
     */
    public final static String s_p_attribute = "http://cargo.iata.org/Details#attribute";
    public final static IRI p_attribute = IRI.create(s_p_attribute);
    /**
     * Error code
     * 
     */
    public final static String s_p_code = "http://cargo.iata.org/Details#code";
    public final static IRI p_code = IRI.create(s_p_code);
    /**
     * Message of the error
     * 
     */
    public final static String s_p_message = "http://cargo.iata.org/Details#message";
    public final static IRI p_message = IRI.create(s_p_message);
    /**
     * Object for which the error applies
     * 
     */
    public final static String s_p_resource = "http://cargo.iata.org/Details#resource";
    public final static IRI p_resource = IRI.create(s_p_resource);
    /**
     * Brief description of the error
     * 
     */
    public final static String s_p_title = "http://cargo.iata.org/Error#title";
    public final static IRI p_title = IRI.create(s_p_title);
    /**
     * Logistics object the event is valid for
     * 
     */
    public final static String s_p_logisticsObjectRef_A = "http://cargo.iata.org/Event#logisticsObjectRef";
    public final static IRI p_logisticsObjectRef_A = IRI.create(s_p_logisticsObjectRef_A);
    /**
     * Valid status
     * 
     */
    public final static String s_p_status_A = "http://cargo.iata.org/Event#status";
    public final static IRI p_status_A = IRI.create(s_p_status_A);
    /**
     * Used only when the event is only applicable to certain linked logistics objects in the primary logistics object (logisticsObjectRef)
     * 
     */
    public final static String s_p_statusApplicableTo = "http://cargo.iata.org/Event#statusApplicableTo";
    public final static IRI p_statusApplicableTo = IRI.create(s_p_statusApplicableTo);
    /**
     * Company IoL identifier
     * 
     */
    public final static String s_p_statusBy = "http://cargo.iata.org/Event#statusBy";
    public final static IRI p_statusBy = IRI.create(s_p_statusBy);
    /**
     * Date and time when the event occurred
     * 
     */
    public final static String s_p_statusTimestamp = "http://cargo.iata.org/Event#statusTimestamp";
    public final static IRI p_statusTimestamp = IRI.create(s_p_statusTimestamp);
    /**
     * OBJECT_CREATED or OBJECT_UPDATED
     * 
     */
    public final static String s_p_eventType = "http://cargo.iata.org/Notification#eventType";
    public final static IRI p_eventType = IRI.create(s_p_eventType);
    /**
     * Logistics Object reference for which the notification is sent
     * 
     */
    public final static String s_p_logisticsObjectRef_A_A = "http://cargo.iata.org/Notification#logisticsObjectRef";
    public final static IRI p_logisticsObjectRef_A_A = IRI.create(s_p_logisticsObjectRef_A_A);
    /**
     * Type of Logistics Object
     * 
     */
    public final static String s_p_topic = "http://cargo.iata.org/Notification#topic";
    public final static IRI p_topic = IRI.create(s_p_topic);
    /**
     * Data type of the field to update
     * 
     */
    public final static String s_p_datatype = "http://cargo.iata.org/Object#datatype";
    public final static IRI p_datatype = IRI.create(s_p_datatype);
    /**
     * Value to update
     * 
     */
    public final static String s_p_value = "http://cargo.iata.org/Object#value";
    public final static IRI p_value = IRI.create(s_p_value);
    /**
     * Operation objects must have exactly one op (operation) member; this value indicates which operation is to be performed. The value must be one of add or del; all other values result in an error
     * 
     */
    public final static String s_p_op = "http://cargo.iata.org/Operation#op";
    public final static IRI p_op = IRI.create(s_p_op);
    /**
     * Operations objects must have exactly one p, predicate, member. The value of this member must be an IRI
     * 
     */
    public final static String s_p_p = "http://cargo.iata.org/Operation#p";
    public final static IRI p_p = IRI.create(s_p_p);
    /**
     * Reason for the change (optional)
     * 
     */
    public final static String s_p_description = "http://cargo.iata.org/PatchRequest#description";
    public final static IRI p_description = IRI.create(s_p_description);
    /**
     * Revision number of the Logistics Object
     * 
     */
    public final static String s_p_revision = "http://cargo.iata.org/PatchRequest#revision";
    public final static IRI p_revision = IRI.create(s_p_revision);
    /**
     * Duration of the period to cache the subscription information in seconds
     * 
     */
    public final static String s_p_cacheFor = "http://cargo.iata.org/Subscription#cacheFor";
    public final static IRI p_cacheFor = IRI.create(s_p_cacheFor);
    /**
     * Callback URL of the Client Subscription API where the subscriber receives Logistics Objects
     * 
     */
    public final static String s_p_callbackUrl = "http://cargo.iata.org/Subscription#callbackUrl";
    public final static IRI p_callbackUrl = IRI.create(s_p_callbackUrl);
    /**
     * Content type that the subscriber wants to receive in the notifications
     * 
     */
    public final static String s_p_contentType = "http://cargo.iata.org/Subscription#contentType";
    public final static IRI p_contentType = IRI.create(s_p_contentType);
    /**
     * Either a secret or API Key that ensures that only companies with this subscription information can POST to the subscriber callback endpoint
     * 
     */
    public final static String s_p_secret = "http://cargo.iata.org/Subscription#secret";
    public final static IRI p_secret = IRI.create(s_p_secret);
    /**
     * Flag specifying if the publisher should send the whole logistics object or not in the notification object
     * 
     */
    public final static String s_p_sendLogisticsObjectBody = "http://cargo.iata.org/Subscription#sendLogisticsObjectBody";
    public final static IRI p_sendLogisticsObjectBody = IRI.create(s_p_sendLogisticsObjectBody);
    /**
     * Flag specifying if the subscriber wants to receive updates for a Logistics Object
     * 
     */
    public final static String s_p_subscribeToStatusUpdates = "http://cargo.iata.org/Subscription#subscribeToStatusUpdates";
    public final static IRI p_subscribeToStatusUpdates = IRI.create(s_p_subscribeToStatusUpdates);
    /**
     * Company Identifier of the company the subscriber wants to subscribe to (delegation scenario).
     * 
     */
    public final static String s_p_subscribedTo = "http://cargo.iata.org/Subscription#subscribedTo";
    public final static IRI p_subscribedTo = IRI.create(s_p_subscribedTo);
    /**
     * The Logistics Object type to which the subscriber wants subscribe to
     * 
     */
    public final static String s_p_topic_A = "http://cargo.iata.org/Subscription#topic";
    public final static IRI p_topic_A = IRI.create(s_p_topic_A);
    public final static String s_p_description_A = "http://purl.org/dc/elements/1.1/description";
    public final static IRI p_description_A = IRI.create(s_p_description_A);
    public final static String s_p_title_A = "http://purl.org/dc/elements/1.1/title";
    public final static IRI p_title_A = IRI.create(s_p_title_A);
    public final static String s_p_comment = "http://www.w3.org/2000/01/rdf-schema#comment";
    public final static IRI p_comment = IRI.create(s_p_comment);
    public final static String s_p_label = "http://www.w3.org/2000/01/rdf-schema#label";
    public final static IRI p_label = IRI.create(s_p_label);

}
