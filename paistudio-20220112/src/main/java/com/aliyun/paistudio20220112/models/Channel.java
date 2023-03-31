// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Channel extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Properties")
    public java.util.List<ChannelProperty> properties;

    @NameInMap("Required")
    public Boolean required;

    @NameInMap("SupportedChannelTypes")
    public java.util.List<String> supportedChannelTypes;

    public static Channel build(java.util.Map<String, ?> map) throws Exception {
        Channel self = new Channel();
        return TeaModel.build(map, self);
    }

    public Channel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Channel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Channel setProperties(java.util.List<ChannelProperty> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<ChannelProperty> getProperties() {
        return this.properties;
    }

    public Channel setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public Channel setSupportedChannelTypes(java.util.List<String> supportedChannelTypes) {
        this.supportedChannelTypes = supportedChannelTypes;
        return this;
    }
    public java.util.List<String> getSupportedChannelTypes() {
        return this.supportedChannelTypes;
    }

}
