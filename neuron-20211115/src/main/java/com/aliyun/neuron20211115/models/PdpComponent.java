// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpComponent extends TeaModel {
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
     * <p>组件描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("env")
    public String env;

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
     * <p>组件</p>
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
     * <p>1</p>
     */
    @NameInMap("resourceId")
    public Long resourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>State</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("templateConfiguration")
    public java.util.List<ConfigModel> templateConfiguration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("templateId")
    public Long templateId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("templateVersion")
    public Long templateVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CACHE</p>
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

    public static PdpComponent build(java.util.Map<String, ?> map) throws Exception {
        PdpComponent self = new PdpComponent();
        return TeaModel.build(map, self);
    }

    public PdpComponent setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PdpComponent setConfiguration(java.util.List<ConfigModel> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<ConfigModel> getConfiguration() {
        return this.configuration;
    }

    public PdpComponent setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpComponent setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PdpComponent setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PdpComponent setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
        return this;
    }
    public Boolean getIsCustom() {
        return this.isCustom;
    }

    public PdpComponent setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpComponent setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public PdpComponent setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpComponent setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Long getResourceId() {
        return this.resourceId;
    }

    public PdpComponent setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public PdpComponent setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public PdpComponent setTemplateConfiguration(java.util.List<ConfigModel> templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
        return this;
    }
    public java.util.List<ConfigModel> getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    public PdpComponent setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public PdpComponent setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Long getTemplateVersion() {
        return this.templateVersion;
    }

    public PdpComponent setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PdpComponent setUseScope(String useScope) {
        this.useScope = useScope;
        return this;
    }
    public String getUseScope() {
        return this.useScope;
    }

    public PdpComponent setUseType(String useType) {
        this.useType = useType;
        return this;
    }
    public String getUseType() {
        return this.useType;
    }

}
