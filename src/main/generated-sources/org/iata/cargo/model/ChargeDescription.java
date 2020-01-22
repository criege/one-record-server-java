
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;


/**
 * Other charge description details
 * 
 * This class was generated by OWL2Java 0.13.3
 * 
 */
@OWLClass(iri = Vocabulary.s_c_ChargeDescription)
public class ChargeDescription
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
     * Other charge code. Refer CXML Code List 1.2, e.g. FC - Charges Collect Fee
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_code_A)
    protected Set<String> code;
    /**
     * Charge description
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_description_A)
    protected Set<String> description1;
    /**
     * Other Charge Location indicator - e.g. Origin (O) or Transit (T) or Destination(D)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_locationIndicator)
    protected Set<String> locationIndicator;
    /**
     * Other charge subcode
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_subCode)
    protected Set<String> subCode;

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
        return ((((("ChargeDescription {"+ name)+"<")+ id)+">")+"}");
    }

    public void setCode(Set<String> code) {
        this.code = code;
    }

    public Set<String> getCode() {
        return code;
    }

    public void setDescription1(Set<String> description1) {
        this.description1 = description1;
    }

    public Set<String> getDescription1() {
        return description1;
    }

    public void setLocationIndicator(Set<String> locationIndicator) {
        this.locationIndicator = locationIndicator;
    }

    public Set<String> getLocationIndicator() {
        return locationIndicator;
    }

    public void setSubCode(Set<String> subCode) {
        this.subCode = subCode;
    }

    public Set<String> getSubCode() {
        return subCode;
    }

}