// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTrafficControlTaskRequest extends TeaModel {
    /**
     * <p>The behavior table ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BehaviorTableMetaId")
    public String behaviorTableMetaId;

    /**
     * <p>The control granularity. Valid values: Global (applies globally) and Single (applies to a specific item).</p>
     * 
     * <strong>example:</strong>
     * <p>Global</p>
     */
    @NameInMap("ControlGranularity")
    public String controlGranularity;

    /**
     * <p>The control logic.</p>
     * <ul>
     * <li><p>Guaranteed: The system strictly enforces the control target.</p>
     * </li>
     * <li><p>Approach: The system attempts to meet the control target, but enforcement is not strict.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Guaranteed</p>
     */
    @NameInMap("ControlLogic")
    public String controlLogic;

    /**
     * <p>The control type.</p>
     * <ul>
     * <li><p>Percent: Controls traffic by percentage.</p>
     * </li>
     * <li><p>Quantity: Controls traffic by quantity.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Percent</p>
     */
    @NameInMap("ControlType")
    public String controlType;

    /**
     * <p>The description of the traffic control task.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test task</p>
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
     * <p>2024-03-26</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The execution time.</p>
     * <ul>
     * <li><p>Permanent: The task runs permanently.</p>
     * </li>
     * <li><p>TimeRange: The task runs within a specified time range. This option requires you to also specify the StartTime and EndTime parameters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TimeRange</p>
     */
    @NameInMap("ExecutionTime")
    public String executionTime;

    /**
     * <p>The Flink data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>res-***</p>
     */
    @NameInMap("FlinkResourceId")
    public String flinkResourceId;

    /**
     * <p>The instance ID. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-***test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The item condition in array format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;field\&quot;:\&quot;status\&quot;,\&quot;option\&quot;:\&quot;=\&quot;,\&quot;value\&quot;:\&quot;1\&quot;}]</p>
     */
    @NameInMap("ItemConditionArray")
    public String itemConditionArray;

    /**
     * <p>The item condition in expression format.</p>
     * 
     * <strong>example:</strong>
     * <p>status=1</p>
     */
    @NameInMap("ItemConditionExpress")
    public String itemConditionExpress;

    /**
     * <p>The item condition type.</p>
     * <ul>
     * <li><p>Array: Specifies the array format.</p>
     * </li>
     * <li><p>Expression: Specifies the expression format.</p>
     * </li>
     * </ul>
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
     * <p>The name of the traffic control task.</p>
     * 
     * <strong>example:</strong>
     * <p>task-1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The experiment IDs for the staging environment. Separate multiple IDs with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("PreExperimentIds")
    public String preExperimentIds;

    /**
     * <p>The experiment IDs for the production environment. Separate multiple IDs with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>4,5,6</p>
     */
    @NameInMap("ProdExperimentIds")
    public String prodExperimentIds;

    /**
     * <p>The scene ID. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2402581.html">ListScenes</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>A list of bound engine service IDs.</p>
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
     * <p>The statistical behavior condition in array format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;field\&quot;:\&quot;click\&quot;,\&quot;option\&quot;:\&quot;&lt;=\&quot;,\&quot;value\&quot;:\&quot;30\&quot;}]</p>
     */
    @NameInMap("StatisBehaviorConditionArray")
    public String statisBehaviorConditionArray;

    /**
     * <p>The statistical behavior condition in expression format.</p>
     * 
     * <strong>example:</strong>
     * <p>click=30</p>
     */
    @NameInMap("StatisBehaviorConditionExpress")
    public String statisBehaviorConditionExpress;

    /**
     * <p>The condition type for the statistical behavior.</p>
     * <ul>
     * <li><p>Array: Specifies the array format.</p>
     * </li>
     * <li><p>Expression: Specifies the expression format.</p>
     * </li>
     * </ul>
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
    public java.util.List<CreateTrafficControlTaskRequestTrafficControlTargets> trafficControlTargets;

    /**
     * <p>The intervention user group condition in array format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;field\&quot;:\&quot;gender\&quot;,\&quot;option\&quot;:\&quot;=\&quot;,\&quot;value\&quot;:\&quot;male\&quot;}]</p>
     */
    @NameInMap("UserConditionArray")
    public String userConditionArray;

    /**
     * <p>The intervention user group condition in expression format.</p>
     * 
     * <strong>example:</strong>
     * <p>age&lt;=30&amp;&amp;(3&lt;=level&lt;=6)&amp;&amp;gender=male</p>
     */
    @NameInMap("UserConditionExpress")
    public String userConditionExpress;

    /**
     * <p>The condition type for the intervention user group.</p>
     * <ul>
     * <li><p>Array: Specifies the array format.</p>
     * </li>
     * <li><p>Expression: Specifies the expression format.</p>
     * </li>
     * </ul>
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

    public static CreateTrafficControlTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficControlTaskRequest self = new CreateTrafficControlTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrafficControlTaskRequest setBehaviorTableMetaId(String behaviorTableMetaId) {
        this.behaviorTableMetaId = behaviorTableMetaId;
        return this;
    }
    public String getBehaviorTableMetaId() {
        return this.behaviorTableMetaId;
    }

    public CreateTrafficControlTaskRequest setControlGranularity(String controlGranularity) {
        this.controlGranularity = controlGranularity;
        return this;
    }
    public String getControlGranularity() {
        return this.controlGranularity;
    }

    public CreateTrafficControlTaskRequest setControlLogic(String controlLogic) {
        this.controlLogic = controlLogic;
        return this;
    }
    public String getControlLogic() {
        return this.controlLogic;
    }

    public CreateTrafficControlTaskRequest setControlType(String controlType) {
        this.controlType = controlType;
        return this;
    }
    public String getControlType() {
        return this.controlType;
    }

    public CreateTrafficControlTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTrafficControlTaskRequest setEffectiveSceneIds(java.util.List<Integer> effectiveSceneIds) {
        this.effectiveSceneIds = effectiveSceneIds;
        return this;
    }
    public java.util.List<Integer> getEffectiveSceneIds() {
        return this.effectiveSceneIds;
    }

    public CreateTrafficControlTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateTrafficControlTaskRequest setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public CreateTrafficControlTaskRequest setFlinkResourceId(String flinkResourceId) {
        this.flinkResourceId = flinkResourceId;
        return this;
    }
    public String getFlinkResourceId() {
        return this.flinkResourceId;
    }

    public CreateTrafficControlTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTrafficControlTaskRequest setItemConditionArray(String itemConditionArray) {
        this.itemConditionArray = itemConditionArray;
        return this;
    }
    public String getItemConditionArray() {
        return this.itemConditionArray;
    }

    public CreateTrafficControlTaskRequest setItemConditionExpress(String itemConditionExpress) {
        this.itemConditionExpress = itemConditionExpress;
        return this;
    }
    public String getItemConditionExpress() {
        return this.itemConditionExpress;
    }

    public CreateTrafficControlTaskRequest setItemConditionType(String itemConditionType) {
        this.itemConditionType = itemConditionType;
        return this;
    }
    public String getItemConditionType() {
        return this.itemConditionType;
    }

    public CreateTrafficControlTaskRequest setItemTableMetaId(String itemTableMetaId) {
        this.itemTableMetaId = itemTableMetaId;
        return this;
    }
    public String getItemTableMetaId() {
        return this.itemTableMetaId;
    }

    public CreateTrafficControlTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTrafficControlTaskRequest setPreExperimentIds(String preExperimentIds) {
        this.preExperimentIds = preExperimentIds;
        return this;
    }
    public String getPreExperimentIds() {
        return this.preExperimentIds;
    }

    public CreateTrafficControlTaskRequest setProdExperimentIds(String prodExperimentIds) {
        this.prodExperimentIds = prodExperimentIds;
        return this;
    }
    public String getProdExperimentIds() {
        return this.prodExperimentIds;
    }

    public CreateTrafficControlTaskRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreateTrafficControlTaskRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateTrafficControlTaskRequest setServiceIds(java.util.List<Integer> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<Integer> getServiceIds() {
        return this.serviceIds;
    }

    public CreateTrafficControlTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateTrafficControlTaskRequest setStatisBehaviorConditionArray(String statisBehaviorConditionArray) {
        this.statisBehaviorConditionArray = statisBehaviorConditionArray;
        return this;
    }
    public String getStatisBehaviorConditionArray() {
        return this.statisBehaviorConditionArray;
    }

    public CreateTrafficControlTaskRequest setStatisBehaviorConditionExpress(String statisBehaviorConditionExpress) {
        this.statisBehaviorConditionExpress = statisBehaviorConditionExpress;
        return this;
    }
    public String getStatisBehaviorConditionExpress() {
        return this.statisBehaviorConditionExpress;
    }

    public CreateTrafficControlTaskRequest setStatisBehaviorConditionType(String statisBehaviorConditionType) {
        this.statisBehaviorConditionType = statisBehaviorConditionType;
        return this;
    }
    public String getStatisBehaviorConditionType() {
        return this.statisBehaviorConditionType;
    }

    public CreateTrafficControlTaskRequest setTrafficControlTargets(java.util.List<CreateTrafficControlTaskRequestTrafficControlTargets> trafficControlTargets) {
        this.trafficControlTargets = trafficControlTargets;
        return this;
    }
    public java.util.List<CreateTrafficControlTaskRequestTrafficControlTargets> getTrafficControlTargets() {
        return this.trafficControlTargets;
    }

    public CreateTrafficControlTaskRequest setUserConditionArray(String userConditionArray) {
        this.userConditionArray = userConditionArray;
        return this;
    }
    public String getUserConditionArray() {
        return this.userConditionArray;
    }

    public CreateTrafficControlTaskRequest setUserConditionExpress(String userConditionExpress) {
        this.userConditionExpress = userConditionExpress;
        return this;
    }
    public String getUserConditionExpress() {
        return this.userConditionExpress;
    }

    public CreateTrafficControlTaskRequest setUserConditionType(String userConditionType) {
        this.userConditionType = userConditionType;
        return this;
    }
    public String getUserConditionType() {
        return this.userConditionType;
    }

    public CreateTrafficControlTaskRequest setUserTableMetaId(String userTableMetaId) {
        this.userTableMetaId = userTableMetaId;
        return this;
    }
    public String getUserTableMetaId() {
        return this.userTableMetaId;
    }

    public static class CreateTrafficControlTaskRequestTrafficControlTargets extends TeaModel {
        /**
         * <p>The end time of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-25</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The event for the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>click</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The item condition in array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;field\&quot;:\&quot;status\&quot;,\&quot;option\&quot;:\&quot;=\&quot;,\&quot;value\&quot;:\&quot;1\&quot;}]</p>
         */
        @NameInMap("ItemConditionArray")
        public String itemConditionArray;

        /**
         * <p>The item condition in expression format.</p>
         * 
         * <strong>example:</strong>
         * <p>status=1</p>
         */
        @NameInMap("ItemConditionExpress")
        public String itemConditionExpress;

        /**
         * <p>The condition type for item control.</p>
         * <ul>
         * <li><p>Array: Specifies the array format.</p>
         * </li>
         * <li><p>Expression: Specifies the expression format.</p>
         * </li>
         * </ul>
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
         * <p>target_1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether to enable new product regulation.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NewProductRegulation")
        public Boolean newProductRegulation;

        /**
         * <p>The name of the recall strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>recall_1</p>
         */
        @NameInMap("RecallName")
        public String recallName;

        /**
         * <p>The start time of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-25</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The statistics period.</p>
         * <ul>
         * <li><p>Daily: Statistics are aggregated daily.</p>
         * </li>
         * <li><p>Hour: Statistics are aggregated hourly.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("StatisPeriod")
        public String statisPeriod;

        /**
         * <p>The status of the traffic control target.</p>
         * <ul>
         * <li><p>Opened: The traffic control target is enabled.</p>
         * </li>
         * <li><p>Closed: The traffic control target is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Opened</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tolerance value for the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ToleranceValue")
        public Long toleranceValue;

        /**
         * <p>The value of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Value")
        public Float value;

        public static CreateTrafficControlTaskRequestTrafficControlTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficControlTaskRequestTrafficControlTargets self = new CreateTrafficControlTaskRequestTrafficControlTargets();
            return TeaModel.build(map, self);
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setItemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setItemConditionExpress(String itemConditionExpress) {
            this.itemConditionExpress = itemConditionExpress;
            return this;
        }
        public String getItemConditionExpress() {
            return this.itemConditionExpress;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setItemConditionType(String itemConditionType) {
            this.itemConditionType = itemConditionType;
            return this;
        }
        public String getItemConditionType() {
            return this.itemConditionType;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setNewProductRegulation(Boolean newProductRegulation) {
            this.newProductRegulation = newProductRegulation;
            return this;
        }
        public Boolean getNewProductRegulation() {
            return this.newProductRegulation;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setRecallName(String recallName) {
            this.recallName = recallName;
            return this;
        }
        public String getRecallName() {
            return this.recallName;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setStatisPeriod(String statisPeriod) {
            this.statisPeriod = statisPeriod;
            return this;
        }
        public String getStatisPeriod() {
            return this.statisPeriod;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setToleranceValue(Long toleranceValue) {
            this.toleranceValue = toleranceValue;
            return this;
        }
        public Long getToleranceValue() {
            return this.toleranceValue;
        }

        public CreateTrafficControlTaskRequestTrafficControlTargets setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

}
