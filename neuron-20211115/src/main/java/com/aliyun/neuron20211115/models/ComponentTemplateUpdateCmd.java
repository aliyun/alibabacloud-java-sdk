// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ComponentTemplateUpdateCmd extends TeaModel {
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

    public static ComponentTemplateUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        ComponentTemplateUpdateCmd self = new ComponentTemplateUpdateCmd();
        return TeaModel.build(map, self);
    }

    public ComponentTemplateUpdateCmd setConfiguration(java.util.List<ConfigModel> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<ConfigModel> getConfiguration() {
        return this.configuration;
    }

    public ComponentTemplateUpdateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComponentTemplateUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ComponentTemplateUpdateCmd setUseScope(String useScope) {
        this.useScope = useScope;
        return this;
    }
    public String getUseScope() {
        return this.useScope;
    }

    public ComponentTemplateUpdateCmd setUseType(String useType) {
        this.useType = useType;
        return this;
    }
    public String getUseType() {
        return this.useType;
    }

}
