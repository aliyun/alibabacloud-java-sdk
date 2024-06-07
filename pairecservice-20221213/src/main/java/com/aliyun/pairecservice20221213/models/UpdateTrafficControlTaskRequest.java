// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTaskRequest extends TeaModel {
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

    @NameInMap("StatisBaeaviorConditionArray")
    public String statisBaeaviorConditionArray;

    @NameInMap("StatisBehaviorConditionExpress")
    public String statisBehaviorConditionExpress;

    @NameInMap("StatisBehaviorConditionType")
    public String statisBehaviorConditionType;

    @NameInMap("TrafficControlTargets")
    public java.util.List<UpdateTrafficControlTaskRequestTrafficControlTargets> trafficControlTargets;

    @NameInMap("UserConditionArray")
    public String userConditionArray;

    @NameInMap("UserConditionExpress")
    public String userConditionExpress;

    @NameInMap("UserConditionType")
    public String userConditionType;

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

    public UpdateTrafficControlTaskRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
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
