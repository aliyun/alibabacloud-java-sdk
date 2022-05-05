// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class FieldCondition extends TeaModel {
    // 字段名称
    @NameInMap("fieldName")
    public String fieldName;

    // 复杂查询下，嵌套子条件字段jsonPath
    @NameInMap("nestFieldPath")
    public String nestFieldPath;

    // 复杂查询下，嵌套子条件字段值
    @NameInMap("nestFieldValue")
    public java.util.List<Long> nestFieldValue;

    // 操作符，枚举值
    @NameInMap("operateType")
    public String operateType;

    // 字段值，不同字段值类型不一样
    @NameInMap("value")
    public String value;

    public static FieldCondition build(java.util.Map<String, ?> map) throws Exception {
        FieldCondition self = new FieldCondition();
        return TeaModel.build(map, self);
    }

    public FieldCondition setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public FieldCondition setNestFieldPath(String nestFieldPath) {
        this.nestFieldPath = nestFieldPath;
        return this;
    }
    public String getNestFieldPath() {
        return this.nestFieldPath;
    }

    public FieldCondition setNestFieldValue(java.util.List<Long> nestFieldValue) {
        this.nestFieldValue = nestFieldValue;
        return this;
    }
    public java.util.List<Long> getNestFieldValue() {
        return this.nestFieldValue;
    }

    public FieldCondition setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public FieldCondition setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
