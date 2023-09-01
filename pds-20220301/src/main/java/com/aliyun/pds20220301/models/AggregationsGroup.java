// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AggregationsGroup extends TeaModel {
    @NameInMap("count")
    public Long count;

    @NameInMap("value")
    public byte[] value;

    public static AggregationsGroup build(java.util.Map<String, ?> map) throws Exception {
        AggregationsGroup self = new AggregationsGroup();
        return TeaModel.build(map, self);
    }

    public AggregationsGroup setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public AggregationsGroup setValue(byte[] value) {
        this.value = value;
        return this;
    }
    public byte[] getValue() {
        return this.value;
    }

}
