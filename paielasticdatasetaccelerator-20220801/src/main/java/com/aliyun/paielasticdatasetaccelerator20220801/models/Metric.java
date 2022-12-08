// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class Metric extends TeaModel {
    @NameInMap("Timestamp")
    public String timestamp;

    @NameInMap("Value")
    public Double value;

    public static Metric build(java.util.Map<String, ?> map) throws Exception {
        Metric self = new Metric();
        return TeaModel.build(map, self);
    }

    public Metric setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public Metric setValue(Double value) {
        this.value = value;
        return this;
    }
    public Double getValue() {
        return this.value;
    }

}
