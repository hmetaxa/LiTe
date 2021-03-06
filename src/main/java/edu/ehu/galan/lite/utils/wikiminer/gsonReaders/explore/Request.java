
package edu.ehu.galan.lite.utils.wikiminer.gsonReaders.explore;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


@Generated("com.googlecode.jsonschema2pojo")
public class Request implements Serializable {

    private String id;
    private String labels;
    private String responseFormat;
    private String parentCategories;
    private Map<String, Object> additionalProperties = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getResponseFormat() {
        return responseFormat;
    }

    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public String getParentCategories() {
        return parentCategories;
    }

    public void setParentCategories(String parentCategories) {
        this.parentCategories = parentCategories;
    }

 

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
