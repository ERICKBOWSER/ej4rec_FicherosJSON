
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
public class Elefantes {

    @JsonProperty("peso")
    private Integer peso;
    @JsonProperty("elefantes")
    private List<Elefante> elefantes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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

}
