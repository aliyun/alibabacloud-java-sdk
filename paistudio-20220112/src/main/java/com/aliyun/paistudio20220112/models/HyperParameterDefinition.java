// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class HyperParameterDefinition extends TeaModel {
    @NameInMap("DefaultValue")
    public String defaultValue;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Name")
    public String name;

    @NameInMap("Range")
    public HyperParameterRange range;

    @NameInMap("Required")
    public Boolean required;

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

    public HyperParameterDefinition setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public HyperParameterDefinition setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HyperParameterDefinition setRange(HyperParameterRange range) {
        this.range = range;
        return this;
    }
    public HyperParameterRange getRange() {
        return this.range;
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
