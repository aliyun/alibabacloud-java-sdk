// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Metric extends TeaModel {
    @NameInMap("Time")
    public Long time;

    @NameInMap("Value")
    public String value;

    public static Metric build(java.util.Map<String, ?> map) throws Exception {
        Metric self = new Metric();
        return TeaModel.build(map, self);
    }

    public Metric setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public Metric setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
