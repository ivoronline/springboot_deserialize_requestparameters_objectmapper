package com.ivoronline.springboot_deserialize_requestparameters_objectmapper.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)  //To avoid Error if Request contains additional Parameters
public class PersonDTO {

  @JsonProperty("FirstName")                 //If Request Parameter and DTO Property have different names
  public String name;

  public String height;

}
