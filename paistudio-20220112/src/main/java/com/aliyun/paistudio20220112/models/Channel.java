// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Channel extends TeaModel {
    /**
     * <p>Channel description.</p>
     * 
     * <strong>example:</strong>
     * <p>模型输出。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Channel name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Model</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Storage configuration of the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>Indicates whether the channel must be configured.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Required")
    public Boolean required;

    /**
     * <p>List of storage classes supported by the channel.</p>
     */
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

    public Channel setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
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
