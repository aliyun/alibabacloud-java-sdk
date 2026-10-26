// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTaskTrafficRequest extends TeaModel {
    /**
     * <p>The environment to which the task belongs. Valid values:</p>
     * <ul>
     * <li>Daily: daily environment</li>
     * <li>Pre: pre-release environment</li>
     * <li>Prod: production environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>learn-pairec-cn-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of reported traffic information.</p>
     */
    @NameInMap("Traffics")
    public java.util.List<UpdateTrafficControlTaskTrafficRequestTraffics> traffics;

    /**
     * <p>Invalid parameter. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
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
        /**
         * <p>The traffic object, which can be an item or an experiment item. Valid values: item1, ER_ALL (global), or a value in the L1_EG1_E1 format.</p>
         * 
         * <strong>example:</strong>
         * <p>item1</p>
         */
        @NameInMap("ItemOrExperimentId")
        public String itemOrExperimentId;

        /**
         * <p>The timestamp from the behavior log, indicating the log cutoff time. The value is in ISO 8601 format, using Z to indicate the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T02:05:06.111Z</p>
         */
        @NameInMap("RecordTime")
        public String recordTime;

        /**
         * <p>The target traffic of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("TrafficControlTargetAimTraffic")
        public Double trafficControlTargetAimTraffic;

        /**
         * <p>The ID of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrafficControlTargetId")
        public String trafficControlTargetId;

        /**
         * <p>The actual traffic of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("TrafficControlTargetTraffic")
        public Long trafficControlTargetTraffic;

        /**
         * <p>The overall traffic under the traffic control plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
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
