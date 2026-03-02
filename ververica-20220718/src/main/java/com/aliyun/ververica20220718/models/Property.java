// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Property extends TeaModel {
    /**
     * <p>The default value of the parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>userA</p>
     */
    @NameInMap("defaultValue")
    public String defaultValue;

    /**
     * <p>Indicates whether the format is defined.</p>
     * 
     * <strong>example:</strong>
     * <p>flase</p>
     */
    @NameInMap("definesFormat")
    public Boolean definesFormat;

    /**
     * <p>The description of the parameter.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the parameter key.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>Indicates whether the parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("required")
    public Boolean required;

    /**
     * <p>Indiactes whether the data is sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("sensitive")
    public Boolean sensitive;

    public static Property build(java.util.Map<String, ?> map) throws Exception {
        Property self = new Property();
        return TeaModel.build(map, self);
    }

    public Property setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public Property setDefinesFormat(Boolean definesFormat) {
        this.definesFormat = definesFormat;
        return this;
    }
    public Boolean getDefinesFormat() {
        return this.definesFormat;
    }

    public Property setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Property setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Property setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public Property setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }
    public Boolean getSensitive() {
        return this.sensitive;
    }

}
