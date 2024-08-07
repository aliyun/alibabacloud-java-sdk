// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class VariablesValue extends TeaModel {
    /**
     * <p>Specifies whether the variable is not allowed to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableModify")
    public Boolean disableModify;

    /**
     * <p>Specifies whether the variable is modified.</p>
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
     * <p>&quot;&quot;</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <p>The description of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The template value of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("templateValue")
    public String templateValue;

    /**
     * <p>The variable type. Valid values:</p>
     * <ul>
     * <li>NORMAL: common variable</li>
     * <li>FUNCTION: function variable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The function variables.</p>
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
         * <p>The class name of the function variable.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("funcClassName")
        public String funcClassName;

        /**
         * <p>The template of the function variable.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
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
