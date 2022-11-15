// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class Field extends TeaModel {
    @NameInMap("ArrayValue")
    public String arrayValue;

    @NameInMap("BlobValue")
    public String blobValue;

    @NameInMap("BooleanValue")
    public Boolean booleanValue;

    @NameInMap("IsNull")
    public Boolean isNull;

    @NameInMap("LongValue")
    public Long longValue;

    @NameInMap("StringValue")
    public String stringValue;

    public static Field build(java.util.Map<String, ?> map) throws Exception {
        Field self = new Field();
        return TeaModel.build(map, self);
    }

    public Field setArrayValue(String arrayValue) {
        this.arrayValue = arrayValue;
        return this;
    }
    public String getArrayValue() {
        return this.arrayValue;
    }

    public Field setBlobValue(String blobValue) {
        this.blobValue = blobValue;
        return this;
    }
    public String getBlobValue() {
        return this.blobValue;
    }

    public Field setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
        return this;
    }
    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public Field setIsNull(Boolean isNull) {
        this.isNull = isNull;
        return this;
    }
    public Boolean getIsNull() {
        return this.isNull;
    }

    public Field setLongValue(Long longValue) {
        this.longValue = longValue;
        return this;
    }
    public Long getLongValue() {
        return this.longValue;
    }

    public Field setStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }
    public String getStringValue() {
        return this.stringValue;
    }

}
