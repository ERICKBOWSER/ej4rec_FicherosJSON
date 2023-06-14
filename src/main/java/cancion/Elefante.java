package cancion;

import java.util.LinkedHashMap;
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
    "nombre",
    "peso"
})
@Generated("jsonschema2pojo")
public class Elefante {

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("peso")
    private Integer peso;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Elefante() {
    }

    public Elefante(String nombre, Integer peso) {
        super();
        this.nombre = nombre;
        this.peso = peso;
    }

    @JsonProperty("nombre")
    public String getNombre() {
        return nombre;
    }

    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonProperty("peso")
    public Integer getPeso() {
        return peso;
    }

    @JsonProperty("peso")
    public void setPeso(Integer peso) {
        this.peso = peso;
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
        sb.append(Elefante.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nombre");
        sb.append('=');
        sb.append(((this.nombre == null) ? "<null>" : this.nombre));
        sb.append(',');
        sb.append("peso");
        sb.append('=');
        sb.append(((this.peso == null) ? "<null>" : this.peso));
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
