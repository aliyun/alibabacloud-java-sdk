// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class FieldCondition extends TeaModel {
    // 字段名称
    @NameInMap("fieldName")
    public String fieldName;

    // 操作符，枚举值
    @NameInMap("operateType")
    public String operateType;

    // 字段值
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
