
package com.splitsecnd.integration.atp.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Event",
    "Service"
})
public class EmergencyEvent {

    @JsonProperty("Event")
    private Event event;
    @JsonProperty("Service")
    private com.splitsecnd.integration.atp.model.Service service;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Event
     */
    @JsonProperty("Event")
    public Event getEvent() {
        return event;
    }

    /**
     * 
     * @param event
     *     The Event
     */
    @JsonProperty("Event")
    public void setEvent(Event event) {
        this.event = event;
    }

    /**
     * 
     * @return
     *     The Service
     */
    @JsonProperty("Service")
    public com.splitsecnd.integration.atp.model.Service getService() {
        return service;
    }

    /**
     * 
     * @param service
     *     The Service
     */
    @JsonProperty("Service")
    public void setService(com.splitsecnd.integration.atp.model.Service service) {
        this.service = service;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public static EmergencyEvent getInstance() {
		EmergencyEvent ee = new EmergencyEvent();
		ee.setEvent(Event.getInstance());
		ee.setService(Service.getInstance());
		
		return ee;
	}
}
