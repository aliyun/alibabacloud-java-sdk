// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ComponentTemplateCreateCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("configuration")
    public java.util.List<ConfigModel> configuration;

    /**
     * <strong>example:</strong>
     * <p>用于统一管理资源</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("isCustom")
    public Boolean isCustom;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>State.Redis</p>
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

    public static ComponentTemplateCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        ComponentTemplateCreateCmd self = new ComponentTemplateCreateCmd();
        return TeaModel.build(map, self);
    }

    public ComponentTemplateCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ComponentTemplateCreateCmd setConfiguration(java.util.List<ConfigModel> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<ConfigModel> getConfiguration() {
        return this.configuration;
    }

    public ComponentTemplateCreateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComponentTemplateCreateCmd setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
        return this;
    }
    public Boolean getIsCustom() {
        return this.isCustom;
    }

    public ComponentTemplateCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ComponentTemplateCreateCmd setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ComponentTemplateCreateCmd setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ComponentTemplateCreateCmd setUseScope(String useScope) {
        this.useScope = useScope;
        return this;
    }
    public String getUseScope() {
        return this.useScope;
    }

    public ComponentTemplateCreateCmd setUseType(String useType) {
        this.useType = useType;
        return this;
    }
    public String getUseType() {
        return this.useType;
    }

}
