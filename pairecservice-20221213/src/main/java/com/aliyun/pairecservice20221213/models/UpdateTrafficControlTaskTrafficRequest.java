// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTaskTrafficRequest extends TeaModel {
    /**
     * <p>The environment. Valid values: <code>Daily</code> (daily environment), <code>Pre</code> (pre-release environment), and <code>Prod</code> (production environment).</p>
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
     * <p>A list of traffic objects to report.</p>
     */
    @NameInMap("Traffics")
    public java.util.List<UpdateTrafficControlTaskTrafficRequestTraffics> traffics;

    /**
     * <p>This parameter is invalid and should be ignored.</p>
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
         * <p>The identifier for the traffic object. This can be an item ID, such as <code>item1</code>, an experiment ID, a global identifier (<code>ER_ALL</code>), or a value in <code>L1_EG1_E1</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>item1</p>
         */
        @NameInMap("ItemOrExperimentId")
        public String itemOrExperimentId;

        /**
         * <p>The timestamp from the behavior log. This indicates that the log data is current as of this timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T02:05:06.111Z</p>
         */
        @NameInMap("RecordTime")
        public String recordTime;

        /**
         * <p>The configured target traffic for the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("TrafficControlTargetAimTraffic")
        public Double trafficControlTargetAimTraffic;

        /**
         * <p>The traffic control target ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrafficControlTargetId")
        public String trafficControlTargetId;

        /**
         * <p>The actual traffic volume observed for the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("TrafficControlTargetTraffic")
        public Long trafficControlTargetTraffic;

        /**
         * <p>The total traffic for the traffic control task.</p>
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
