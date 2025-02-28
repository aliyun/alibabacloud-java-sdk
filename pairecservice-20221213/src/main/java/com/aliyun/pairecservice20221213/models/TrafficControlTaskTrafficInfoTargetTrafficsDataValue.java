// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class TrafficControlTaskTrafficInfoTargetTrafficsDataValue extends TeaModel {
    @NameInMap("Traffic")
    public Double traffic;

    @NameInMap("RecordTime")
    public Long recordTime;

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

    public TrafficControlTaskTrafficInfoTargetTrafficsDataValue setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }
    public Long getRecordTime() {
        return this.recordTime;
    }

}
