// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PreviewComponentCrdSchemaCmd extends TeaModel {
    @NameInMap("address")
    public String address;

    @NameInMap("configuration")
    public java.util.List<ConfigModel> configuration;

    @NameInMap("credentials")
    public String credentials;

    @NameInMap("id")
    public Long id;

    @NameInMap("isCustom")
    public Boolean isCustom;

    @NameInMap("name")
    public String name;

    @NameInMap("reesourceVersion")
    public String reesourceVersion;

    @NameInMap("resourceId")
    public Long resourceId;

    @NameInMap("scope")
    public String scope;

    @NameInMap("templateId")
    public Long templateId;

    @NameInMap("type")
    public String type;

    public static PreviewComponentCrdSchemaCmd build(java.util.Map<String, ?> map) throws Exception {
        PreviewComponentCrdSchemaCmd self = new PreviewComponentCrdSchemaCmd();
        return TeaModel.build(map, self);
    }

    public PreviewComponentCrdSchemaCmd setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public PreviewComponentCrdSchemaCmd setConfiguration(java.util.List<ConfigModel> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<ConfigModel> getConfiguration() {
        return this.configuration;
    }

    public PreviewComponentCrdSchemaCmd setCredentials(String credentials) {
        this.credentials = credentials;
        return this;
    }
    public String getCredentials() {
        return this.credentials;
    }

    public PreviewComponentCrdSchemaCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PreviewComponentCrdSchemaCmd setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
        return this;
    }
    public Boolean getIsCustom() {
        return this.isCustom;
    }

    public PreviewComponentCrdSchemaCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PreviewComponentCrdSchemaCmd setReesourceVersion(String reesourceVersion) {
        this.reesourceVersion = reesourceVersion;
        return this;
    }
    public String getReesourceVersion() {
        return this.reesourceVersion;
    }

    public PreviewComponentCrdSchemaCmd setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Long getResourceId() {
        return this.resourceId;
    }

    public PreviewComponentCrdSchemaCmd setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public PreviewComponentCrdSchemaCmd setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public PreviewComponentCrdSchemaCmd setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
