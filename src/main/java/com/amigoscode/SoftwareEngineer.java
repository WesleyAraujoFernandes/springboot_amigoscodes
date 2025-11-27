package com.amigoscode;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.ToString.Include;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(includeFieldNames = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SoftwareEngineer {
    @Include
    @lombok.EqualsAndHashCode.Include
    private Integer id;
    @Include
    private String name;
    @Include
    private List<String> techStack;
}
