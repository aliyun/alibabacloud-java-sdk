// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Metric extends TeaModel {
    // 时间戳（毫秒）
    @NameInMap("Time")
    public Long time;

    // 样本值
    @NameInMap("Value")
    public Float value;

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

    public Metric setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

}
