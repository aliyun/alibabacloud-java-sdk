// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class FieldInputConfig extends TeaModel {
    @NameInMap("Arrayed")
    public Boolean arrayed;

    @NameInMap("DefaultValue")
    public String defaultValue;

    @NameInMap("FieldCheckRegex")
    public String fieldCheckRegex;

    @NameInMap("FieldClass")
    public String fieldClass;

    @NameInMap("FieldConfigs")
    public java.util.List<FieldInputConfig> fieldConfigs;

    @NameInMap("FieldDescription")
    public String fieldDescription;

    @NameInMap("FieldExample")
    public String fieldExample;

    @NameInMap("FieldName")
    public String fieldName;

    @NameInMap("FieldPath")
    public String fieldPath;

    @NameInMap("FieldType")
    public String fieldType;

    @NameInMap("Required")
    public Boolean required;

    public static FieldInputConfig build(java.util.Map<String, ?> map) throws Exception {
        FieldInputConfig self = new FieldInputConfig();
        return TeaModel.build(map, self);
    }

    public FieldInputConfig setArrayed(Boolean arrayed) {
        this.arrayed = arrayed;
        return this;
    }
    public Boolean getArrayed() {
        return this.arrayed;
    }

    public FieldInputConfig setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public FieldInputConfig setFieldCheckRegex(String fieldCheckRegex) {
        this.fieldCheckRegex = fieldCheckRegex;
        return this;
    }
    public String getFieldCheckRegex() {
        return this.fieldCheckRegex;
    }

    public FieldInputConfig setFieldClass(String fieldClass) {
        this.fieldClass = fieldClass;
        return this;
    }
    public String getFieldClass() {
        return this.fieldClass;
    }

    public FieldInputConfig setFieldConfigs(java.util.List<FieldInputConfig> fieldConfigs) {
        this.fieldConfigs = fieldConfigs;
        return this;
    }
    public java.util.List<FieldInputConfig> getFieldConfigs() {
        return this.fieldConfigs;
    }

    public FieldInputConfig setFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
        return this;
    }
    public String getFieldDescription() {
        return this.fieldDescription;
    }

    public FieldInputConfig setFieldExample(String fieldExample) {
        this.fieldExample = fieldExample;
        return this;
    }
    public String getFieldExample() {
        return this.fieldExample;
    }

    public FieldInputConfig setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public FieldInputConfig setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }
    public String getFieldPath() {
        return this.fieldPath;
    }

    public FieldInputConfig setFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    public String getFieldType() {
        return this.fieldType;
    }

    public FieldInputConfig setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

}
