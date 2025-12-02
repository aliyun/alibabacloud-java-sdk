// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class FieldOutputConfig extends TeaModel {
    @NameInMap("DefaultValue")
    public String defaultValue;

    @NameInMap("FieldDescription")
    public String fieldDescription;

    @NameInMap("FieldExample")
    public String fieldExample;

    @NameInMap("FieldName")
    public String fieldName;

    @NameInMap("FieldType")
    public String fieldType;

    public static FieldOutputConfig build(java.util.Map<String, ?> map) throws Exception {
        FieldOutputConfig self = new FieldOutputConfig();
        return TeaModel.build(map, self);
    }

    public FieldOutputConfig setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public FieldOutputConfig setFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
        return this;
    }
    public String getFieldDescription() {
        return this.fieldDescription;
    }

    public FieldOutputConfig setFieldExample(String fieldExample) {
        this.fieldExample = fieldExample;
        return this;
    }
    public String getFieldExample() {
        return this.fieldExample;
    }

    public FieldOutputConfig setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public FieldOutputConfig setFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    public String getFieldType() {
        return this.fieldType;
    }

}
