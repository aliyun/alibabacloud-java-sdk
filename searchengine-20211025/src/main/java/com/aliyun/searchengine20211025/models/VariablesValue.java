// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class VariablesValue extends TeaModel {
    /**
     * <p>Specifies whether modification is not allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableModify")
    public Boolean disableModify;

    /**
     * <p>Indicates whether the variable has been modified.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isModify")
    public Boolean isModify;

    /**
     * <p>The variable value.</p>
     * 
     * <strong>example:</strong>
     * <p>qrs_connection_timeout</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>超时时间</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The template value.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("templateValue")
    public String templateValue;

    /**
     * <p>The type. Valid values:</p>
     * <ul>
     * <li>NORMAL: normal variable</li>
     * <li>FUNCTION: function variable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The function variable.</p>
     */
    @NameInMap("funcValue")
    public VariablesValueFuncValue funcValue;

    public static VariablesValue build(java.util.Map<String, ?> map) throws Exception {
        VariablesValue self = new VariablesValue();
        return TeaModel.build(map, self);
    }

    public VariablesValue setDisableModify(Boolean disableModify) {
        this.disableModify = disableModify;
        return this;
    }
    public Boolean getDisableModify() {
        return this.disableModify;
    }

    public VariablesValue setIsModify(Boolean isModify) {
        this.isModify = isModify;
        return this;
    }
    public Boolean getIsModify() {
        return this.isModify;
    }

    public VariablesValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public VariablesValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VariablesValue setTemplateValue(String templateValue) {
        this.templateValue = templateValue;
        return this;
    }
    public String getTemplateValue() {
        return this.templateValue;
    }

    public VariablesValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public VariablesValue setFuncValue(VariablesValueFuncValue funcValue) {
        this.funcValue = funcValue;
        return this;
    }
    public VariablesValueFuncValue getFuncValue() {
        return this.funcValue;
    }

    public static class VariablesValueFuncValue extends TeaModel {
        /**
         * <p>The method class name.</p>
         * 
         * <strong>example:</strong>
         * <p>ModifyFile</p>
         */
        @NameInMap("funcClassName")
        public String funcClassName;

        /**
         * <p>The template.</p>
         * 
         * <strong>example:</strong>
         * <p>test-template</p>
         */
        @NameInMap("template")
        public String template;

        public static VariablesValueFuncValue build(java.util.Map<String, ?> map) throws Exception {
            VariablesValueFuncValue self = new VariablesValueFuncValue();
            return TeaModel.build(map, self);
        }

        public VariablesValueFuncValue setFuncClassName(String funcClassName) {
            this.funcClassName = funcClassName;
            return this;
        }
        public String getFuncClassName() {
            return this.funcClassName;
        }

        public VariablesValueFuncValue setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

    }

}
