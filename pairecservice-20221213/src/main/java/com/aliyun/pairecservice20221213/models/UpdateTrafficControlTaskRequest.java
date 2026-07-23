// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTaskRequest extends TeaModel {
    /**
     * <p>The behavior table ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BehaviorTableMetaId")
    public String behaviorTableMetaId;

    /**
     * <p>The control granularity.</p>
     * 
     * <strong>example:</strong>
     * <p>Global</p>
     */
    @NameInMap("ControlGranularity")
    public String controlGranularity;

    /**
     * <p>The control logic.</p>
     * 
     * <strong>example:</strong>
     * <p>Guaranteed</p>
     */
    @NameInMap("ControlLogic")
    public String controlLogic;

    /**
     * <p>The control type.</p>
     * 
     * <strong>example:</strong>
     * <p>Percent</p>
     */
    @NameInMap("ControlType")
    public String controlType;

    /**
     * <p>The description of the traffic control plan.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>A list of effective scene IDs.</p>
     */
    @NameInMap("EffectiveSceneIds")
    public java.util.List<Integer> effectiveSceneIds;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-25</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The execution time. Valid values: <code>Permanent</code> (runs indefinitely) and <code>TimeRange</code> (runs within a specified period). If you select <code>TimeRange</code>, you must also specify <code>StartTime</code> and <code>EndTime</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Permanent</p>
     */
    @NameInMap("ExecutionTime")
    public String executionTime;

    /**
     * <p>The Flink resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>resource-xxx</p>
     */
    @NameInMap("FlinkResourceId")
    public String flinkResourceId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-1324***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The item conditions, specified in an array format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;field&quot;:&quot;status&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
     */
    @NameInMap("ItemConditionArray")
    public String itemConditionArray;

    /**
     * <p>The item conditions, specified as an expression.</p>
     * 
     * <strong>example:</strong>
     * <p>status=1</p>
     */
    @NameInMap("ItemConditionExpress")
    public String itemConditionExpress;

    /**
     * <p>The item condition type.</p>
     * 
     * <strong>example:</strong>
     * <p>Array</p>
     */
    @NameInMap("ItemConditionType")
    public String itemConditionType;

    /**
     * <p>The item table ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ItemTableMetaId")
    public String itemTableMetaId;

    /**
     * <p>The name of the traffic control plan.</p>
     * 
     * <strong>example:</strong>
     * <p>plan-1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>A comma-separated list of pre-release experiment IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>3,4</p>
     */
    @NameInMap("PreExperimentIds")
    public String preExperimentIds;

    /**
     * <p>A comma-separated list of production experiment IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("ProdExperimentIds")
    public String prodExperimentIds;

    /**
     * <p>The scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The engine service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>A list of associated engine service IDs.</p>
     */
    @NameInMap("ServiceIds")
    public java.util.List<Integer> serviceIds;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-25</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The conditions for behavior statistics, specified in an array format.</p>
     * 
     * <strong>example:</strong>
     * <p>click=exposure</p>
     */
    @NameInMap("StatisBaeaviorConditionArray")
    public String statisBaeaviorConditionArray;

    /**
     * <p>The conditions for behavior statistics, specified in an array format.</p>
     * 
     * <strong>example:</strong>
     * <p>click=exposure</p>
     */
    @NameInMap("StatisBehaviorConditionArray")
    public String statisBehaviorConditionArray;

    /**
     * <p>The conditions for behavior statistics, specified as an expression.</p>
     * 
     * <strong>example:</strong>
     * <p>click=30</p>
     */
    @NameInMap("StatisBehaviorConditionExpress")
    public String statisBehaviorConditionExpress;

    /**
     * <p>The condition type for behavior statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>Array</p>
     */
    @NameInMap("StatisBehaviorConditionType")
    public String statisBehaviorConditionType;

    /**
     * <p>A list of traffic control targets.</p>
     */
    @NameInMap("TrafficControlTargets")
    public java.util.List<UpdateTrafficControlTaskRequestTrafficControlTargets> trafficControlTargets;

    /**
     * <p>The conditions for the target user group, specified in an array format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;field&quot;:&quot;gender&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;male&quot;}]</p>
     */
    @NameInMap("UserConditionArray")
    public String userConditionArray;

    /**
     * <p>The conditions for the target user group, specified as an expression.</p>
     * 
     * <strong>example:</strong>
     * <p>age&lt;=30&amp;&amp;(3&lt;=level&lt;=6)&amp;&amp;gender=male</p>
     */
    @NameInMap("UserConditionExpress")
    public String userConditionExpress;

    /**
     * <p>The condition type for the target user group.</p>
     * 
     * <strong>example:</strong>
     * <p>Array</p>
     */
    @NameInMap("UserConditionType")
    public String userConditionType;

    /**
     * <p>The user table ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("UserTableMetaId")
    public String userTableMetaId;

    public static UpdateTrafficControlTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficControlTaskRequest self = new UpdateTrafficControlTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficControlTaskRequest setBehaviorTableMetaId(String behaviorTableMetaId) {
        this.behaviorTableMetaId = behaviorTableMetaId;
        return this;
    }
    public String getBehaviorTableMetaId() {
        return this.behaviorTableMetaId;
    }

    public UpdateTrafficControlTaskRequest setControlGranularity(String controlGranularity) {
        this.controlGranularity = controlGranularity;
        return this;
    }
    public String getControlGranularity() {
        return this.controlGranularity;
    }

    public UpdateTrafficControlTaskRequest setControlLogic(String controlLogic) {
        this.controlLogic = controlLogic;
        return this;
    }
    public String getControlLogic() {
        return this.controlLogic;
    }

    public UpdateTrafficControlTaskRequest setControlType(String controlType) {
        this.controlType = controlType;
        return this;
    }
    public String getControlType() {
        return this.controlType;
    }

    public UpdateTrafficControlTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTrafficControlTaskRequest setEffectiveSceneIds(java.util.List<Integer> effectiveSceneIds) {
        this.effectiveSceneIds = effectiveSceneIds;
        return this;
    }
    public java.util.List<Integer> getEffectiveSceneIds() {
        return this.effectiveSceneIds;
    }

    public UpdateTrafficControlTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateTrafficControlTaskRequest setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public UpdateTrafficControlTaskRequest setFlinkResourceId(String flinkResourceId) {
        this.flinkResourceId = flinkResourceId;
        return this;
    }
    public String getFlinkResourceId() {
        return this.flinkResourceId;
    }

    public UpdateTrafficControlTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTrafficControlTaskRequest setItemConditionArray(String itemConditionArray) {
        this.itemConditionArray = itemConditionArray;
        return this;
    }
    public String getItemConditionArray() {
        return this.itemConditionArray;
    }

    public UpdateTrafficControlTaskRequest setItemConditionExpress(String itemConditionExpress) {
        this.itemConditionExpress = itemConditionExpress;
        return this;
    }
    public String getItemConditionExpress() {
        return this.itemConditionExpress;
    }

    public UpdateTrafficControlTaskRequest setItemConditionType(String itemConditionType) {
        this.itemConditionType = itemConditionType;
        return this;
    }
    public String getItemConditionType() {
        return this.itemConditionType;
    }

    public UpdateTrafficControlTaskRequest setItemTableMetaId(String itemTableMetaId) {
        this.itemTableMetaId = itemTableMetaId;
        return this;
    }
    public String getItemTableMetaId() {
        return this.itemTableMetaId;
    }

    public UpdateTrafficControlTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTrafficControlTaskRequest setPreExperimentIds(String preExperimentIds) {
        this.preExperimentIds = preExperimentIds;
        return this;
    }
    public String getPreExperimentIds() {
        return this.preExperimentIds;
    }

    public UpdateTrafficControlTaskRequest setProdExperimentIds(String prodExperimentIds) {
        this.prodExperimentIds = prodExperimentIds;
        return this;
    }
    public String getProdExperimentIds() {
        return this.prodExperimentIds;
    }

    public UpdateTrafficControlTaskRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public UpdateTrafficControlTaskRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateTrafficControlTaskRequest setServiceIds(java.util.List<Integer> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<Integer> getServiceIds() {
        return this.serviceIds;
    }

    public UpdateTrafficControlTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateTrafficControlTaskRequest setStatisBaeaviorConditionArray(String statisBaeaviorConditionArray) {
        this.statisBaeaviorConditionArray = statisBaeaviorConditionArray;
        return this;
    }
    public String getStatisBaeaviorConditionArray() {
        return this.statisBaeaviorConditionArray;
    }

    public UpdateTrafficControlTaskRequest setStatisBehaviorConditionArray(String statisBehaviorConditionArray) {
        this.statisBehaviorConditionArray = statisBehaviorConditionArray;
        return this;
    }
    public String getStatisBehaviorConditionArray() {
        return this.statisBehaviorConditionArray;
    }

    public UpdateTrafficControlTaskRequest setStatisBehaviorConditionExpress(String statisBehaviorConditionExpress) {
        this.statisBehaviorConditionExpress = statisBehaviorConditionExpress;
        return this;
    }
    public String getStatisBehaviorConditionExpress() {
        return this.statisBehaviorConditionExpress;
    }

    public UpdateTrafficControlTaskRequest setStatisBehaviorConditionType(String statisBehaviorConditionType) {
        this.statisBehaviorConditionType = statisBehaviorConditionType;
        return this;
    }
    public String getStatisBehaviorConditionType() {
        return this.statisBehaviorConditionType;
    }

    public UpdateTrafficControlTaskRequest setTrafficControlTargets(java.util.List<UpdateTrafficControlTaskRequestTrafficControlTargets> trafficControlTargets) {
        this.trafficControlTargets = trafficControlTargets;
        return this;
    }
    public java.util.List<UpdateTrafficControlTaskRequestTrafficControlTargets> getTrafficControlTargets() {
        return this.trafficControlTargets;
    }

    public UpdateTrafficControlTaskRequest setUserConditionArray(String userConditionArray) {
        this.userConditionArray = userConditionArray;
        return this;
    }
    public String getUserConditionArray() {
        return this.userConditionArray;
    }

    public UpdateTrafficControlTaskRequest setUserConditionExpress(String userConditionExpress) {
        this.userConditionExpress = userConditionExpress;
        return this;
    }
    public String getUserConditionExpress() {
        return this.userConditionExpress;
    }

    public UpdateTrafficControlTaskRequest setUserConditionType(String userConditionType) {
        this.userConditionType = userConditionType;
        return this;
    }
    public String getUserConditionType() {
        return this.userConditionType;
    }

    public UpdateTrafficControlTaskRequest setUserTableMetaId(String userTableMetaId) {
        this.userTableMetaId = userTableMetaId;
        return this;
    }
    public String getUserTableMetaId() {
        return this.userTableMetaId;
    }

    public static class UpdateTrafficControlTaskRequestTrafficControlTargets extends TeaModel {
        /**
         * <p>The end time of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T18:02:57.487556956+08:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The event for the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>exposure</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The item conditions, specified in an array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;status&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
         */
        @NameInMap("ItemConditionArray")
        public String itemConditionArray;

        /**
         * <p>The item conditions, specified as an expression.</p>
         * 
         * <strong>example:</strong>
         * <p>age&gt;20</p>
         */
        @NameInMap("ItemConditionExpress")
        public String itemConditionExpress;

        /**
         * <p>The item condition type.</p>
         * 
         * <strong>example:</strong>
         * <p>Array</p>
         */
        @NameInMap("ItemConditionType")
        public String itemConditionType;

        /**
         * <p>The name of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>target-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether this is a new item recall.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NewProductRegulation")
        public Boolean newProductRegulation;

        /**
         * <p>The recall policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>hot_recall</p>
         */
        @NameInMap("RecallName")
        public String recallName;

        /**
         * <p>The start time of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-10T09:16:03.893+08:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StatisPeriod")
        public String statisPeriod;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tolerance range for the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ToleranceValue")
        public Long toleranceValue;

        /**
         * <p>The value of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Value")
        public Float value;

        public static UpdateTrafficControlTaskRequestTrafficControlTargets build(java.util.Map<String, ?> map) throws Exception {
            UpdateTrafficControlTaskRequestTrafficControlTargets self = new UpdateTrafficControlTaskRequestTrafficControlTargets();
            return TeaModel.build(map, self);
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setItemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setItemConditionExpress(String itemConditionExpress) {
            this.itemConditionExpress = itemConditionExpress;
            return this;
        }
        public String getItemConditionExpress() {
            return this.itemConditionExpress;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setItemConditionType(String itemConditionType) {
            this.itemConditionType = itemConditionType;
            return this;
        }
        public String getItemConditionType() {
            return this.itemConditionType;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setNewProductRegulation(Boolean newProductRegulation) {
            this.newProductRegulation = newProductRegulation;
            return this;
        }
        public Boolean getNewProductRegulation() {
            return this.newProductRegulation;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setRecallName(String recallName) {
            this.recallName = recallName;
            return this;
        }
        public String getRecallName() {
            return this.recallName;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setStatisPeriod(String statisPeriod) {
            this.statisPeriod = statisPeriod;
            return this;
        }
        public String getStatisPeriod() {
            return this.statisPeriod;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setToleranceValue(Long toleranceValue) {
            this.toleranceValue = toleranceValue;
            return this;
        }
        public Long getToleranceValue() {
            return this.toleranceValue;
        }

        public UpdateTrafficControlTaskRequestTrafficControlTargets setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

}
