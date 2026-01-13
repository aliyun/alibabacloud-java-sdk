// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class TrafficControlTaskTrafficInfoTaskTrafficsValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Traffic")
    public Double traffic;

    public static TrafficControlTaskTrafficInfoTaskTrafficsValue build(java.util.Map<String, ?> map) throws Exception {
        TrafficControlTaskTrafficInfoTaskTrafficsValue self = new TrafficControlTaskTrafficInfoTaskTrafficsValue();
        return TeaModel.build(map, self);
    }

    public TrafficControlTaskTrafficInfoTaskTrafficsValue setTraffic(Double traffic) {
        this.traffic = traffic;
        return this;
    }
    public Double getTraffic() {
        return this.traffic;
    }

}
