// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class FilesConfigVariablesValue extends TeaModel {
    /**
     * <p>变量描述</p>
     * 
     * <strong>example:</strong>
     * <p>自定义变量</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>是否可被用户修改</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("disableModify")
    public Boolean disableModify;

    /**
     * <p>变量是否被修改过</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isModify")
    public Boolean isModify;

    /**
     * <p>类型：普通变量-NORMAL； function变量-FUNCTION</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>变量值</p>
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
