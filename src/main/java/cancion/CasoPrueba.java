package cancion;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
//import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
// Hay que importarlo ya que el que viene predeterminado no funciona
import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "peso",
    "elefantes"
})
@Generated("jsonschema2pojo")
public class CasoPrueba {

    @JsonProperty("peso")
    private Integer peso;
    @JsonProperty("elefantes")
    private List<Elefante> elefantes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public CasoPrueba() {
    }

    /**
     *
     * @param elefantes
     * @param peso
     */
    public CasoPrueba(Integer peso, List<Elefante> elefantes) {
        super();
        this.peso = peso;
        this.elefantes = elefantes;
    }

    @JsonProperty("peso")
    public Integer getPeso() {
        return peso;
    }

    @JsonProperty("peso")
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @JsonProperty("elefantes")
    public List<Elefante> getElefantes() {
        return elefantes;
    }

    @JsonProperty("elefantes")
    public void setElefantes(List<Elefante> elefantes) {
        this.elefantes = elefantes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Elefantes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("peso");
        sb.append('=');
        sb.append(((this.peso == null) ? "<null>" : this.peso));
        sb.append(',');
        sb.append("elefantes");
        sb.append('=');
        sb.append(((this.elefantes == null) ? "<null>" : this.elefantes));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
