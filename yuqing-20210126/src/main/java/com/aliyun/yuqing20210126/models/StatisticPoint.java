// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class StatisticPoint extends TeaModel {
    @NameInMap("key")
    public String key;

    @NameInMap("value")
    public Double value;

    public static StatisticPoint build(java.util.Map<String, ?> map) throws Exception {
        StatisticPoint self = new StatisticPoint();
        return TeaModel.build(map, self);
    }

    public StatisticPoint setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public StatisticPoint setValue(Double value) {
        this.value = value;
        return this;
    }
    public Double getValue() {
        return this.value;
    }

}
