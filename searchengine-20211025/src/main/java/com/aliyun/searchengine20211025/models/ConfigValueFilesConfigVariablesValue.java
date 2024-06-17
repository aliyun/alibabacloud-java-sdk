// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ConfigValueFilesConfigVariablesValue extends TeaModel {
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("disableModify")
    public Boolean disableModify;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isModify")
    public Boolean isModify;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("value")
    public String value;

    public static ConfigValueFilesConfigVariablesValue build(java.util.Map<String, ?> map) throws Exception {
        ConfigValueFilesConfigVariablesValue self = new ConfigValueFilesConfigVariablesValue();
        return TeaModel.build(map, self);
    }

    public ConfigValueFilesConfigVariablesValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConfigValueFilesConfigVariablesValue setDisableModify(Boolean disableModify) {
        this.disableModify = disableModify;
        return this;
    }
    public Boolean getDisableModify() {
        return this.disableModify;
    }

    public ConfigValueFilesConfigVariablesValue setIsModify(Boolean isModify) {
        this.isModify = isModify;
        return this;
    }
    public Boolean getIsModify() {
        return this.isModify;
    }

    public ConfigValueFilesConfigVariablesValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ConfigValueFilesConfigVariablesValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
