// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Channel extends TeaModel {
    // A brief description for the channel.
    @NameInMap("Description")
    public String description;

    // The name of channel.
    @NameInMap("Name")
    public String name;

    // The properties of channel.
    @NameInMap("Properties")
    public java.util.List<ChannelProperty> properties;

    // Indicates whethe the channels is required.
    @NameInMap("Required")
    public Boolean required;

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

}
