// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class TrafficControlTaskTrafficInfoTargetTrafficsDataValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Traffic")
    public Double traffic;

    @NameInMap("RecorfTime")
    public Long recorfTime;

    public static TrafficControlTaskTrafficInfoTargetTrafficsDataValue build(java.util.Map<String, ?> map) throws Exception {
        TrafficControlTaskTrafficInfoTargetTrafficsDataValue self = new TrafficControlTaskTrafficInfoTargetTrafficsDataValue();
        return TeaModel.build(map, self);
    }

    public TrafficControlTaskTrafficInfoTargetTrafficsDataValue setTraffic(Double traffic) {
        this.traffic = traffic;
        return this;
    }
    public Double getTraffic() {
        return this.traffic;
    }

    public TrafficControlTaskTrafficInfoTargetTrafficsDataValue setRecorfTime(Long recorfTime) {
        this.recorfTime = recorfTime;
        return this;
    }
    public Long getRecorfTime() {
        return this.recorfTime;
    }

}
