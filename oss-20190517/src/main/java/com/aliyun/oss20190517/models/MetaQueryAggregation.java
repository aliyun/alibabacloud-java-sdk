// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class MetaQueryAggregation extends TeaModel {
    @NameInMap("Field")
    public String field;

    @NameInMap("Operation")
    public String operation;

    public static MetaQueryAggregation build(java.util.Map<String, ?> map) throws Exception {
        MetaQueryAggregation self = new MetaQueryAggregation();
        return TeaModel.build(map, self);
    }

    public MetaQueryAggregation setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public MetaQueryAggregation setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

}
