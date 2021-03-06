
package org.iata.cargo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;


/**
 * Loading location details
 * 
 * This class was generated by OWL2Java 0.14.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Location)
public class Location
    implements Serializable
{

    @Id(generated = true)
@JsonProperty("@id")
    protected String id;
    @JsonIgnore
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @JsonIgnore
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
@JsonProperty("@type")
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;
    /**
     * Address details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_address)
    protected Set<Address> address;
    /**
     * Geolocation details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_geolocation)
    protected Set<Geolocation> geolocation;
    /**
     * Location code of airport, freight terminal, seaport, rail station. UN/LOCODE city code (5 letter) or IATA airport code (3 letter)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_code)
    protected Set<String> code;
    /**
     * Location type - e.g. Airport, Freight terminal, Rail station, Seaport, etc
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_locationType)
    protected Set<String> locationType;
    /**
     * Full name of the location
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_name_A)
    protected Set<String> name1;

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
        return ((((("Location {"+ name)+"<")+ id)+">")+"}");
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }

    public Set<Address> getAddress() {
        return address;
    }

    public void setGeolocation(Set<Geolocation> geolocation) {
        this.geolocation = geolocation;
    }

    public Set<Geolocation> getGeolocation() {
        return geolocation;
    }

    public void setCode(Set<String> code) {
        this.code = code;
    }

    public Set<String> getCode() {
        return code;
    }

    public void setLocationType(Set<String> locationType) {
        this.locationType = locationType;
    }

    public Set<String> getLocationType() {
        return locationType;
    }

    public void setName1(Set<String> name1) {
        this.name1 = name1;
    }

    public Set<String> getName1() {
        return name1;
    }

}
