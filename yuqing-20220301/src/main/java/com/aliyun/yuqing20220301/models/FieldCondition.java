// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class FieldCondition extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("fieldName")
    public String fieldName;

    @NameInMap("nestFieldPath")
    public String nestFieldPath;

    @NameInMap("nestFieldValue")
    public java.util.List<Long> nestFieldValue;

    /**
     * <strong>example:</strong>
     * <p>=</p>
     */
    @NameInMap("operateType")
    public String operateType;

    /**
     * <strong>example:</strong>
     * <p>yyy</p>
     */
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
