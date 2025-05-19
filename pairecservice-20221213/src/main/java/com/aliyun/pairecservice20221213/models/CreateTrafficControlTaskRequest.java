// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTrafficControlTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BehaviorTableMetaId")
    public String behaviorTableMetaId;

    /**
     * <strong>example:</strong>
     * <p>Global</p>
     */
    @NameInMap("ControlGranularity")
    public String controlGranularity;

    /**
     * <strong>example:</strong>
     * <p>Guaranteed</p>
     */
    @NameInMap("ControlLogic")
    public String controlLogic;

    /**
     * <strong>example:</strong>
     * <p>Percent</p>
     */
    @NameInMap("ControlType")
    public String controlType;

    /**
     * <strong>example:</strong>
     * <p>this is a test task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2024-03-26</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>TimeRange</p>
     */
    @NameInMap("ExecutionTime")
    public String executionTime;

    @NameInMap("FlinkResourceId")
    public String flinkResourceId;

    /**
     * <strong>example:</strong>
     * <p>pairec-cn-***test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;field\&quot;:\&quot;status\&quot;,\&quot;option\&quot;:\&quot;=\&quot;,\&quot;value\&quot;:\&quot;1\&quot;}]</p>
     */
    @NameInMap("ItemConditionArray")
    public String itemConditionArray;

    /**
     * <strong>example:</strong>
     * <p>status=1</p>
     */
    @NameInMap("ItemConditionExpress")
    public String itemConditionExpress;

    /**
     * <strong>example:</strong>
     * <p>Array</p>
     */
    @NameInMap("ItemConditionType")
    public String itemConditionType;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ItemTableMetaId")
    public String itemTableMetaId;

    /**
     * <strong>example:</strong>
     * <p>task-1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("PreExperimentIds")
    public String preExperimentIds;

    @NameInMap("ProdExperimentIds")
    public String prodExperimentIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <strong>example:</strong>
     * <p>2024-03-25</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;field\&quot;:\&quot;click\&quot;,\&quot;option\&quot;:\&quot;&lt;=\&quot;,\&quot;value\&quot;:\&quot;30\&quot;}]</p>
     */
    @NameInMap("StatisBehaviorConditionArray")
    public String statisBehaviorConditionArray;

    /**
     * <strong>example:</strong>
     * <p>click=30</p>
     */
    @NameInMap("StatisBehaviorConditionExpress")
    public String statisBehaviorConditionExpress;

    /**
     * <strong>example:</strong>
     * <p>Array</p>
     */
    @NameInMap("StatisBehaviorConditionType")
    public String statisBehaviorConditionType;

    @NameInMap("TrafficControlTargets")
    public java.util.List<CreateTrafficControlTaskRequestTrafficControlTargets> trafficControlTargets;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;field\&quot;:\&quot;gender\&quot;,\&quot;option\&quot;:\&quot;=\&quot;,\&quot;value\&quot;:\&quot;male\&quot;}]</p>
     */
    @NameInMap("UserConditionArray")
    public String userConditionArray;

    /**
     * <strong>example:</strong>
     * <p>age&lt;=30&amp;&amp;(3&lt;=level&lt;=6)&amp;&amp;gender=male</p>
     */
    @NameInMap("UserConditionExpress")
    public String userConditionExpress;

    /**
     * <strong>example:</strong>
     * <p>Array</p>
     */
    @NameInMap("UserConditionType")
    public String userConditionType;

    /**
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
         * <strong>example:</strong>
         * <p>2024-04-25</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>click</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;field\&quot;:\&quot;status\&quot;,\&quot;option\&quot;:\&quot;=\&quot;,\&quot;value\&quot;:\&quot;1\&quot;}]</p>
         */
        @NameInMap("ItemConditionArray")
        public String itemConditionArray;

        /**
         * <strong>example:</strong>
         * <p>status=1</p>
         */
        @NameInMap("ItemConditionExpress")
        public String itemConditionExpress;

        /**
         * <strong>example:</strong>
         * <p>Array</p>
         */
        @NameInMap("ItemConditionType")
        public String itemConditionType;

        /**
         * <strong>example:</strong>
         * <p>target_1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NewProductRegulation")
        public Boolean newProductRegulation;

        /**
         * <strong>example:</strong>
         * <p>recall_1</p>
         */
        @NameInMap("RecallName")
        public String recallName;

        /**
         * <strong>example:</strong>
         * <p>2024-03-25</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("StatisPeriod")
        public String statisPeriod;

        /**
         * <strong>example:</strong>
         * <p>Opened</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ToleranceValue")
        public Long toleranceValue;

        /**
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
