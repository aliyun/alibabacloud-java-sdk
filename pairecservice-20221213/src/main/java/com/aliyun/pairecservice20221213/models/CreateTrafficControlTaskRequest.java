// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTrafficControlTaskRequest extends TeaModel {
    @NameInMap("BehaviorTableMetaId")
    public String behaviorTableMetaId;

    @NameInMap("ControlGranularity")
    public String controlGranularity;

    @NameInMap("ControlLogic")
    public String controlLogic;

    @NameInMap("ControlType")
    public String controlType;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExecutionTime")
    public String executionTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemConditionArray")
    public String itemConditionArray;

    @NameInMap("ItemConditionExpress")
    public String itemConditionExpress;

    @NameInMap("ItemConditionType")
    public String itemConditionType;

    @NameInMap("ItemTableMetaId")
    public String itemTableMetaId;

    @NameInMap("Name")
    public String name;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StatisBehaviorConditionArray")
    public String statisBehaviorConditionArray;

    @NameInMap("StatisBehaviorConditionExpress")
    public String statisBehaviorConditionExpress;

    @NameInMap("StatisBehaviorConditionType")
    public String statisBehaviorConditionType;

    @NameInMap("TrafficControlTargets")
    public java.util.List<CreateTrafficControlTaskRequestTrafficControlTargets> trafficControlTargets;

    @NameInMap("UserConditionArray")
    public String userConditionArray;

    @NameInMap("UserConditionExpress")
    public String userConditionExpress;

    @NameInMap("UserConditionType")
    public String userConditionType;

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

    public CreateTrafficControlTaskRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
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
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Event")
        public String event;

        @NameInMap("ItemConditionArray")
        public String itemConditionArray;

        @NameInMap("ItemConditionExpress")
        public String itemConditionExpress;

        @NameInMap("ItemConditionType")
        public String itemConditionType;

        @NameInMap("Name")
        public String name;

        @NameInMap("NewProductRegulation")
        public Boolean newProductRegulation;

        @NameInMap("RecallName")
        public String recallName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StatisPeriod")
        public String statisPeriod;

        @NameInMap("Status")
        public String status;

        @NameInMap("ToleranceValue")
        public Long toleranceValue;

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
