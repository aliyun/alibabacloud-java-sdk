// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class FilesConfigVariablesValue extends TeaModel {
    /**
     * <p>The description of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom variable</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether the variable is not allowed to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("disableModify")
    public Boolean disableModify;

    /**
     * <p>Specifies whether the variable is modified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isModify")
    public Boolean isModify;

    /**
     * <p>The variable type. Valid values: NORMAL: common variable. FUNCTION: function variable.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The variable value.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("value")
    public String value;

    public static FilesConfigVariablesValue build(java.util.Map<String, ?> map) throws Exception {
        FilesConfigVariablesValue self = new FilesConfigVariablesValue();
        return TeaModel.build(map, self);
    }

    public FilesConfigVariablesValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FilesConfigVariablesValue setDisableModify(Boolean disableModify) {
        this.disableModify = disableModify;
        return this;
    }
    public Boolean getDisableModify() {
        return this.disableModify;
    }

    public FilesConfigVariablesValue setIsModify(Boolean isModify) {
        this.isModify = isModify;
        return this;
    }
    public Boolean getIsModify() {
        return this.isModify;
    }

    public FilesConfigVariablesValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FilesConfigVariablesValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
