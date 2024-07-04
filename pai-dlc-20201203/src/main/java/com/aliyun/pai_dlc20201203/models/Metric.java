// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Metric extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1616987726587</p>
     */
    @NameInMap("Time")
    public Long time;

    /**
     * <strong>example:</strong>
     * <p>23.45</p>
     */
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
