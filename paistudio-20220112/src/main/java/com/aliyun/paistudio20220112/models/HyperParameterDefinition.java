// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class HyperParameterDefinition extends TeaModel {
    // Default value for the parameter.
    @NameInMap("DefaultValue")
    public String defaultValue;

    // Description for the parameter.
    @NameInMap("Description")
    public String description;

    // Name of the parameter.
    @NameInMap("Name")
    public String name;

    // Indicates whether the parameter is required
    @NameInMap("Required")
    public Boolean required;

    // Type of the parameter.
    @NameInMap("Type")
    public String type;

    public static HyperParameterDefinition build(java.util.Map<String, ?> map) throws Exception {
        HyperParameterDefinition self = new HyperParameterDefinition();
        return TeaModel.build(map, self);
    }

    public HyperParameterDefinition setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public HyperParameterDefinition setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HyperParameterDefinition setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HyperParameterDefinition setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public HyperParameterDefinition setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
