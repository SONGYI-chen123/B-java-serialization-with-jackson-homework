package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.serializer.AgeSet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonVo {

  private String id;

  @JsonSerialize(using = AgeSet.AgeSerializer.class)
  private Integer age;
  private String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String hobby;
}
