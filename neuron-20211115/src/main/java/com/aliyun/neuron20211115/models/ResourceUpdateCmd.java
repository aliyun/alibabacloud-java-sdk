// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ResourceUpdateCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http://</p>
     */
    @NameInMap("address")
    public String address;

    @NameInMap("configuration")
    public String configuration;

    /**
     * <strong>example:</strong>
     * <p>{ak:xxxx,sk:xxx}</p>
     */
    @NameInMap("credentials")
    public String credentials;

    /**
     * <strong>example:</strong>
     * <p>用于统一管理资源</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>Inner</p>
     */
    @NameInMap("useScope")
    public String useScope;

    /**
     * <strong>example:</strong>
     * <p>Share</p>
     */
    @NameInMap("useType")
    public String useType;

    public static ResourceUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        ResourceUpdateCmd self = new ResourceUpdateCmd();
        return TeaModel.build(map, self);
    }

    public ResourceUpdateCmd setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ResourceUpdateCmd setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public ResourceUpdateCmd setCredentials(String credentials) {
        this.credentials = credentials;
        return this;
    }
    public String getCredentials() {
        return this.credentials;
    }

    public ResourceUpdateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ResourceUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ResourceUpdateCmd setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ResourceUpdateCmd setUseScope(String useScope) {
        this.useScope = useScope;
        return this;
    }
    public String getUseScope() {
        return this.useScope;
    }

    public ResourceUpdateCmd setUseType(String useType) {
        this.useType = useType;
        return this;
    }
    public String getUseType() {
        return this.useType;
    }

}
