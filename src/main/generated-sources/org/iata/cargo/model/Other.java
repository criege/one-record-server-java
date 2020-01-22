
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
 * Other contact options e.g. Skype, Whatsapp, Viber, Fax etc
 * 
 * This class was generated by OWL2Java 0.13.3
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Other)
public class Other
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
     * Contact details e.g. Skype ID 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_detail)
    protected Set<String> detail;
    /**
     * Contact type - e.g. Skype
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_type_A_A_A)
    protected Set<String> type;

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
        return ((((("Other {"+ name)+"<")+ id)+">")+"}");
    }

    public void setDetail(Set<String> detail) {
        this.detail = detail;
    }

    public Set<String> getDetail() {
        return detail;
    }

    public void setType(Set<String> type) {
        this.type = type;
    }

    public Set<String> getType() {
        return type;
    }

}
