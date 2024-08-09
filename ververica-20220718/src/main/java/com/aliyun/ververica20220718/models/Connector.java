// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Connector extends TeaModel {
    @NameInMap("creator")
    public String creator;

    @NameInMap("creatorName")
    public String creatorName;

    @NameInMap("dependencies")
    public java.util.List<String> dependencies;

    @NameInMap("lookup")
    public Boolean lookup;

    @NameInMap("modifier")
    public String modifier;

    @NameInMap("modifierName")
    public String modifierName;

    @NameInMap("name")
    public String name;

    @NameInMap("properties")
    public java.util.List<Property> properties;

    @NameInMap("sink")
    public Boolean sink;

    @NameInMap("source")
    public Boolean source;

    @NameInMap("supportedFormats")
    public java.util.List<String> supportedFormats;

    @NameInMap("type")
    public String type;

    public static Connector build(java.util.Map<String, ?> map) throws Exception {
        Connector self = new Connector();
        return TeaModel.build(map, self);
    }

    public Connector setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Connector setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public Connector setDependencies(java.util.List<String> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public java.util.List<String> getDependencies() {
        return this.dependencies;
    }

    public Connector setLookup(Boolean lookup) {
        this.lookup = lookup;
        return this;
    }
    public Boolean getLookup() {
        return this.lookup;
    }

    public Connector setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public Connector setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public Connector setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Connector setProperties(java.util.List<Property> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<Property> getProperties() {
        return this.properties;
    }

    public Connector setSink(Boolean sink) {
        this.sink = sink;
        return this;
    }
    public Boolean getSink() {
        return this.sink;
    }

    public Connector setSource(Boolean source) {
        this.source = source;
        return this;
    }
    public Boolean getSource() {
        return this.source;
    }

    public Connector setSupportedFormats(java.util.List<String> supportedFormats) {
        this.supportedFormats = supportedFormats;
        return this;
    }
    public java.util.List<String> getSupportedFormats() {
        return this.supportedFormats;
    }

    public Connector setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
