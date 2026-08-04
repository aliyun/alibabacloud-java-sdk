// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class HyperParameterDefinition extends TeaModel {
    /**
     * <p>The default value of the hyperparameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <p>The description of the hyperparameter.</p>
     * 
     * <strong>example:</strong>
     * <p>参数定义了训练的batch_size。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Batch Size</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The name of the parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>batch_size</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The value range of the parameter.</p>
     */
    @NameInMap("Range")
    public HyperParameterRange range;

    /**
     * <p>Specifies whether the parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Required")
    public Boolean required;

    /**
     * <p>The type of the hyperparameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Integer</p>
     */
    @NameInMap("Type")
    public String type;

    public static HyperParameterDefinition build(java.util.Map<String, ?> map) throws Exception {
        HyperParameterDefinition self = new HyperParameterDefinition();
        return TeaModel.build(map, self);
    }

    public HyperParameterDefinition setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public HyperParameterDefinition setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HyperParameterDefinition setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public HyperParameterDefinition setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HyperParameterDefinition setRange(HyperParameterRange range) {
        this.range = range;
        return this;
    }
    public HyperParameterRange getRange() {
        return this.range;
    }

    public HyperParameterDefinition setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public HyperParameterDefinition setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
