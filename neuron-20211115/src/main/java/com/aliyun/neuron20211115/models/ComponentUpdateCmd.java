// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ComponentUpdateCmd extends TeaModel {
    @NameInMap("configuration")
    public java.util.List<ConfigModel> configuration;

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

    /**
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("scope")
    public String scope;

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

    public static ComponentUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        ComponentUpdateCmd self = new ComponentUpdateCmd();
        return TeaModel.build(map, self);
    }

    public ComponentUpdateCmd setConfiguration(java.util.List<ConfigModel> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<ConfigModel> getConfiguration() {
        return this.configuration;
    }

    public ComponentUpdateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComponentUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ComponentUpdateCmd setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ComponentUpdateCmd setUseScope(String useScope) {
        this.useScope = useScope;
        return this;
    }
    public String getUseScope() {
        return this.useScope;
    }

    public ComponentUpdateCmd setUseType(String useType) {
        this.useType = useType;
        return this;
    }
    public String getUseType() {
        return this.useType;
    }

}
