// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ComponentTemplate extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("configuration")
    public java.util.List<ConfigModel> configuration;

    /**
     * <strong>example:</strong>
     * <p>Redis模板描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("isCustom")
    public Boolean isCustom;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Redis模板</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("productId")
    public Long productId;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>State</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>State</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Inner</p>
     */
    @NameInMap("useScope")
    public String useScope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Share</p>
     */
    @NameInMap("useType")
    public String useType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Long version;

    public static ComponentTemplate build(java.util.Map<String, ?> map) throws Exception {
        ComponentTemplate self = new ComponentTemplate();
        return TeaModel.build(map, self);
    }

    public ComponentTemplate setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ComponentTemplate setConfiguration(java.util.List<ConfigModel> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<ConfigModel> getConfiguration() {
        return this.configuration;
    }

    public ComponentTemplate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComponentTemplate setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ComponentTemplate setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
        return this;
    }
    public Boolean getIsCustom() {
        return this.isCustom;
    }

    public ComponentTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ComponentTemplate setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ComponentTemplate setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ComponentTemplate setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ComponentTemplate setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ComponentTemplate setUseScope(String useScope) {
        this.useScope = useScope;
        return this;
    }
    public String getUseScope() {
        return this.useScope;
    }

    public ComponentTemplate setUseType(String useType) {
        this.useType = useType;
        return this;
    }
    public String getUseType() {
        return this.useType;
    }

    public ComponentTemplate setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
