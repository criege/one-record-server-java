
package org.iata.api.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.api.Vocabulary;
import org.iata.cargo.model.Company;


/**
 * Company information in the Internet of Logistics
 * 
 * This class was generated by OWL2Java 0.13.3
 * 
 */
@OWLClass(iri = Vocabulary.s_c_CompanyInformation)
public class CompanyInformation
    implements Serializable
{

    @Id(generated = true)
    protected String id;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    protected Set<String> types;
    @Properties
    protected Map<String, Set<String>> properties;
    /**
     * Company details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_company)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Set<Company> company;
    /**
     * Non mandatory error details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_error_A)
    protected Set<Error> error;
    /**
     * Endpoint of the company in the Internet of Logistics
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_serverEndpoint)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected String serverEndpoint;
    /**
     * Supported content types of the server
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_supportedContentTypes)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected Set<String> supportedContentTypes;
    /**
     * Supported logistics object types on the server
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_supportedLogisticsObjects)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected Set<String> supportedLogisticsObjects;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("CompanyInformation {"+ name)+"<")+ id)+">")+"}");
    }

    public void setCompany(Set<Company> company) {
        this.company = company;
    }

    public Set<Company> getCompany() {
        return company;
    }

    public void setError(Set<Error> error) {
        this.error = error;
    }

    public Set<Error> getError() {
        return error;
    }

    public void setServerEndpoint(String serverEndpoint) {
        this.serverEndpoint = serverEndpoint;
    }

    public String getServerEndpoint() {
        return serverEndpoint;
    }

    public void setSupportedContentTypes(Set<String> supportedContentTypes) {
        this.supportedContentTypes = supportedContentTypes;
    }

    public Set<String> getSupportedContentTypes() {
        return supportedContentTypes;
    }

    public void setSupportedLogisticsObjects(Set<String> supportedLogisticsObjects) {
        this.supportedLogisticsObjects = supportedLogisticsObjects;
    }

    public Set<String> getSupportedLogisticsObjects() {
        return supportedLogisticsObjects;
    }

}
