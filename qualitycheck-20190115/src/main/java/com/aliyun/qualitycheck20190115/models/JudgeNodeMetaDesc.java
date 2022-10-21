// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class JudgeNodeMetaDesc extends TeaModel {
    @NameInMap("ActualValue")
    public String actualValue;

    @NameInMap("DataType")
    public Integer dataType;

    @NameInMap("Field")
    public String field;

    @NameInMap("FieldType")
    public Integer fieldType;

    @NameInMap("Symbol")
    public Integer symbol;

    @NameInMap("Value")
    public String value;

    public static JudgeNodeMetaDesc build(java.util.Map<String, ?> map) throws Exception {
        JudgeNodeMetaDesc self = new JudgeNodeMetaDesc();
        return TeaModel.build(map, self);
    }

    public JudgeNodeMetaDesc setActualValue(String actualValue) {
        this.actualValue = actualValue;
        return this;
    }
    public String getActualValue() {
        return this.actualValue;
    }

    public JudgeNodeMetaDesc setDataType(Integer dataType) {
        this.dataType = dataType;
        return this;
    }
    public Integer getDataType() {
        return this.dataType;
    }

    public JudgeNodeMetaDesc setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public JudgeNodeMetaDesc setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    public Integer getFieldType() {
        return this.fieldType;
    }

    public JudgeNodeMetaDesc setSymbol(Integer symbol) {
        this.symbol = symbol;
        return this;
    }
    public Integer getSymbol() {
        return this.symbol;
    }

    public JudgeNodeMetaDesc setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
