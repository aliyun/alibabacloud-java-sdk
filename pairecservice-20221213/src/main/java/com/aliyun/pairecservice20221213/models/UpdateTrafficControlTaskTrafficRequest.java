// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTaskTrafficRequest extends TeaModel {
    @NameInMap("Environment")
    public String environment;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Traffics")
    public java.util.List<UpdateTrafficControlTaskTrafficRequestTraffics> traffics;

    @NameInMap("new-param-3")
    public String newParam3;

    public static UpdateTrafficControlTaskTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficControlTaskTrafficRequest self = new UpdateTrafficControlTaskTrafficRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficControlTaskTrafficRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public UpdateTrafficControlTaskTrafficRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTrafficControlTaskTrafficRequest setTraffics(java.util.List<UpdateTrafficControlTaskTrafficRequestTraffics> traffics) {
        this.traffics = traffics;
        return this;
    }
    public java.util.List<UpdateTrafficControlTaskTrafficRequestTraffics> getTraffics() {
        return this.traffics;
    }

    public UpdateTrafficControlTaskTrafficRequest setNewParam3(String newParam3) {
        this.newParam3 = newParam3;
        return this;
    }
    public String getNewParam3() {
        return this.newParam3;
    }

    public static class UpdateTrafficControlTaskTrafficRequestTraffics extends TeaModel {
        @NameInMap("ItemOrExperimentId")
        public String itemOrExperimentId;

        @NameInMap("RecordTime")
        public String recordTime;

        @NameInMap("TrafficControlTargetAimTraffic")
        public Double trafficControlTargetAimTraffic;

        @NameInMap("TrafficControlTargetId")
        public String trafficControlTargetId;

        @NameInMap("TrafficControlTargetTraffic")
        public Long trafficControlTargetTraffic;

        @NameInMap("TrafficControlTaskTraffic")
        public Long trafficControlTaskTraffic;

        public static UpdateTrafficControlTaskTrafficRequestTraffics build(java.util.Map<String, ?> map) throws Exception {
            UpdateTrafficControlTaskTrafficRequestTraffics self = new UpdateTrafficControlTaskTrafficRequestTraffics();
            return TeaModel.build(map, self);
        }

        public UpdateTrafficControlTaskTrafficRequestTraffics setItemOrExperimentId(String itemOrExperimentId) {
            this.itemOrExperimentId = itemOrExperimentId;
            return this;
        }
        public String getItemOrExperimentId() {
            return this.itemOrExperimentId;
        }

        public UpdateTrafficControlTaskTrafficRequestTraffics setRecordTime(String recordTime) {
            this.recordTime = recordTime;
            return this;
        }
        public String getRecordTime() {
            return this.recordTime;
        }

        public UpdateTrafficControlTaskTrafficRequestTraffics setTrafficControlTargetAimTraffic(Double trafficControlTargetAimTraffic) {
            this.trafficControlTargetAimTraffic = trafficControlTargetAimTraffic;
            return this;
        }
        public Double getTrafficControlTargetAimTraffic() {
            return this.trafficControlTargetAimTraffic;
        }

        public UpdateTrafficControlTaskTrafficRequestTraffics setTrafficControlTargetId(String trafficControlTargetId) {
            this.trafficControlTargetId = trafficControlTargetId;
            return this;
        }
        public String getTrafficControlTargetId() {
            return this.trafficControlTargetId;
        }

        public UpdateTrafficControlTaskTrafficRequestTraffics setTrafficControlTargetTraffic(Long trafficControlTargetTraffic) {
            this.trafficControlTargetTraffic = trafficControlTargetTraffic;
            return this;
        }
        public Long getTrafficControlTargetTraffic() {
            return this.trafficControlTargetTraffic;
        }

        public UpdateTrafficControlTaskTrafficRequestTraffics setTrafficControlTaskTraffic(Long trafficControlTaskTraffic) {
            this.trafficControlTaskTraffic = trafficControlTaskTraffic;
            return this;
        }
        public Long getTrafficControlTaskTraffic() {
            return this.trafficControlTaskTraffic;
        }

    }

}
