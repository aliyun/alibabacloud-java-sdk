// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class VariablesValue extends TeaModel {
    /**
     * <p>Specifies whether the variable cannot be modified.</p>
     */
    @NameInMap("disableModify")
    public Boolean disableModify;

    /**
     * <p>Specifies whether the variable is modified.</p>
     */
    @NameInMap("isModify")
    public Boolean isModify;

    /**
     * <p>The value of the variable.</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <p>The description about the variable.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The value of the template.</p>
     */
    @NameInMap("templateValue")
    public String templateValue;

    /**
     * <p>The type of the variable. Valid values:</p>
     * <br>
     * <p>*   NORMAL: a normal variable</p>
     * <p>*   FUNCTION: a function variable</p>
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
         * <p>The class name.</p>
         */
        @NameInMap("funcClassName")
        public String funcClassName;

        /**
         * <p>The template of the variable.</p>
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
