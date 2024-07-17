// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTaskResponseBody extends TeaModel {
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

    @NameInMap("EverPublished")
    public Boolean everPublished;

    @NameInMap("ExecutionTime")
    public String executionTime;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

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

    @NameInMap("PrepubStatus")
    public String prepubStatus;

    @NameInMap("ProductStatus")
    public String productStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SceneName")
    public String sceneName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StatisBehaviorConditionArray")
    public String statisBehaviorConditionArray;

    @NameInMap("StatisBehaviorConditionExpress")
    public String statisBehaviorConditionExpress;

    @NameInMap("StatisBehaviorConditionType")
    public String statisBehaviorConditionType;

    @NameInMap("TrafficControlTargets")
    public java.util.List<GetTrafficControlTaskResponseBodyTrafficControlTargets> trafficControlTargets;

    @NameInMap("TrafficControlTaskId")
    public String trafficControlTaskId;

    @NameInMap("UserConditionArray")
    public String userConditionArray;

    @NameInMap("UserConditionExpress")
    public String userConditionExpress;

    @NameInMap("UserConditionType")
    public String userConditionType;

    @NameInMap("UserTableMetaId")
    public String userTableMetaId;

    public static GetTrafficControlTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficControlTaskResponseBody self = new GetTrafficControlTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrafficControlTaskResponseBody setBehaviorTableMetaId(String behaviorTableMetaId) {
        this.behaviorTableMetaId = behaviorTableMetaId;
        return this;
    }
    public String getBehaviorTableMetaId() {
        return this.behaviorTableMetaId;
    }

    public GetTrafficControlTaskResponseBody setControlGranularity(String controlGranularity) {
        this.controlGranularity = controlGranularity;
        return this;
    }
    public String getControlGranularity() {
        return this.controlGranularity;
    }

    public GetTrafficControlTaskResponseBody setControlLogic(String controlLogic) {
        this.controlLogic = controlLogic;
        return this;
    }
    public String getControlLogic() {
        return this.controlLogic;
    }

    public GetTrafficControlTaskResponseBody setControlType(String controlType) {
        this.controlType = controlType;
        return this;
    }
    public String getControlType() {
        return this.controlType;
    }

    public GetTrafficControlTaskResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTrafficControlTaskResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetTrafficControlTaskResponseBody setEverPublished(Boolean everPublished) {
        this.everPublished = everPublished;
        return this;
    }
    public Boolean getEverPublished() {
        return this.everPublished;
    }

    public GetTrafficControlTaskResponseBody setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public GetTrafficControlTaskResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetTrafficControlTaskResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetTrafficControlTaskResponseBody setItemConditionArray(String itemConditionArray) {
        this.itemConditionArray = itemConditionArray;
        return this;
    }
    public String getItemConditionArray() {
        return this.itemConditionArray;
    }

    public GetTrafficControlTaskResponseBody setItemConditionExpress(String itemConditionExpress) {
        this.itemConditionExpress = itemConditionExpress;
        return this;
    }
    public String getItemConditionExpress() {
        return this.itemConditionExpress;
    }

    public GetTrafficControlTaskResponseBody setItemConditionType(String itemConditionType) {
        this.itemConditionType = itemConditionType;
        return this;
    }
    public String getItemConditionType() {
        return this.itemConditionType;
    }

    public GetTrafficControlTaskResponseBody setItemTableMetaId(String itemTableMetaId) {
        this.itemTableMetaId = itemTableMetaId;
        return this;
    }
    public String getItemTableMetaId() {
        return this.itemTableMetaId;
    }

    public GetTrafficControlTaskResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetTrafficControlTaskResponseBody setPrepubStatus(String prepubStatus) {
        this.prepubStatus = prepubStatus;
        return this;
    }
    public String getPrepubStatus() {
        return this.prepubStatus;
    }

    public GetTrafficControlTaskResponseBody setProductStatus(String productStatus) {
        this.productStatus = productStatus;
        return this;
    }
    public String getProductStatus() {
        return this.productStatus;
    }

    public GetTrafficControlTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrafficControlTaskResponseBody setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public GetTrafficControlTaskResponseBody setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public GetTrafficControlTaskResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetTrafficControlTaskResponseBody setStatisBehaviorConditionArray(String statisBehaviorConditionArray) {
        this.statisBehaviorConditionArray = statisBehaviorConditionArray;
        return this;
    }
    public String getStatisBehaviorConditionArray() {
        return this.statisBehaviorConditionArray;
    }

    public GetTrafficControlTaskResponseBody setStatisBehaviorConditionExpress(String statisBehaviorConditionExpress) {
        this.statisBehaviorConditionExpress = statisBehaviorConditionExpress;
        return this;
    }
    public String getStatisBehaviorConditionExpress() {
        return this.statisBehaviorConditionExpress;
    }

    public GetTrafficControlTaskResponseBody setStatisBehaviorConditionType(String statisBehaviorConditionType) {
        this.statisBehaviorConditionType = statisBehaviorConditionType;
        return this;
    }
    public String getStatisBehaviorConditionType() {
        return this.statisBehaviorConditionType;
    }

    public GetTrafficControlTaskResponseBody setTrafficControlTargets(java.util.List<GetTrafficControlTaskResponseBodyTrafficControlTargets> trafficControlTargets) {
        this.trafficControlTargets = trafficControlTargets;
        return this;
    }
    public java.util.List<GetTrafficControlTaskResponseBodyTrafficControlTargets> getTrafficControlTargets() {
        return this.trafficControlTargets;
    }

    public GetTrafficControlTaskResponseBody setTrafficControlTaskId(String trafficControlTaskId) {
        this.trafficControlTaskId = trafficControlTaskId;
        return this;
    }
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

    public GetTrafficControlTaskResponseBody setUserConditionArray(String userConditionArray) {
        this.userConditionArray = userConditionArray;
        return this;
    }
    public String getUserConditionArray() {
        return this.userConditionArray;
    }

    public GetTrafficControlTaskResponseBody setUserConditionExpress(String userConditionExpress) {
        this.userConditionExpress = userConditionExpress;
        return this;
    }
    public String getUserConditionExpress() {
        return this.userConditionExpress;
    }

    public GetTrafficControlTaskResponseBody setUserConditionType(String userConditionType) {
        this.userConditionType = userConditionType;
        return this;
    }
    public String getUserConditionType() {
        return this.userConditionType;
    }

    public GetTrafficControlTaskResponseBody setUserTableMetaId(String userTableMetaId) {
        this.userTableMetaId = userTableMetaId;
        return this;
    }
    public String getUserTableMetaId() {
        return this.userTableMetaId;
    }

    public static class GetTrafficControlTaskResponseBodyTrafficControlTargetsSplitParts extends TeaModel {
        @NameInMap("SetPoints")
        public java.util.List<Integer> setPoints;

        @NameInMap("SetValues")
        public java.util.List<Long> setValues;

        @NameInMap("TimePoints")
        public java.util.List<Integer> timePoints;

        public static GetTrafficControlTaskResponseBodyTrafficControlTargetsSplitParts build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficControlTaskResponseBodyTrafficControlTargetsSplitParts self = new GetTrafficControlTaskResponseBodyTrafficControlTargetsSplitParts();
            return TeaModel.build(map, self);
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargetsSplitParts setSetPoints(java.util.List<Integer> setPoints) {
            this.setPoints = setPoints;
            return this;
        }
        public java.util.List<Integer> getSetPoints() {
            return this.setPoints;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargetsSplitParts setSetValues(java.util.List<Long> setValues) {
            this.setValues = setValues;
            return this;
        }
        public java.util.List<Long> getSetValues() {
            return this.setValues;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargetsSplitParts setTimePoints(java.util.List<Integer> timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public java.util.List<Integer> getTimePoints() {
            return this.timePoints;
        }

    }

    public static class GetTrafficControlTaskResponseBodyTrafficControlTargets extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Event")
        public String event;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

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

        @NameInMap("SplitParts")
        public GetTrafficControlTaskResponseBodyTrafficControlTargetsSplitParts splitParts;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StatisPeriod")
        public String statisPeriod;

        @NameInMap("Status")
        public String status;

        @NameInMap("ToleranceValue")
        public Long toleranceValue;

        @NameInMap("TrafficControlTargetId")
        public String trafficControlTargetId;

        @NameInMap("Value")
        public Float value;

        public static GetTrafficControlTaskResponseBodyTrafficControlTargets build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficControlTaskResponseBodyTrafficControlTargets self = new GetTrafficControlTaskResponseBodyTrafficControlTargets();
            return TeaModel.build(map, self);
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setItemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setItemConditionExpress(String itemConditionExpress) {
            this.itemConditionExpress = itemConditionExpress;
            return this;
        }
        public String getItemConditionExpress() {
            return this.itemConditionExpress;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setItemConditionType(String itemConditionType) {
            this.itemConditionType = itemConditionType;
            return this;
        }
        public String getItemConditionType() {
            return this.itemConditionType;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setNewProductRegulation(Boolean newProductRegulation) {
            this.newProductRegulation = newProductRegulation;
            return this;
        }
        public Boolean getNewProductRegulation() {
            return this.newProductRegulation;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setRecallName(String recallName) {
            this.recallName = recallName;
            return this;
        }
        public String getRecallName() {
            return this.recallName;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setSplitParts(GetTrafficControlTaskResponseBodyTrafficControlTargetsSplitParts splitParts) {
            this.splitParts = splitParts;
            return this;
        }
        public GetTrafficControlTaskResponseBodyTrafficControlTargetsSplitParts getSplitParts() {
            return this.splitParts;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setStatisPeriod(String statisPeriod) {
            this.statisPeriod = statisPeriod;
            return this;
        }
        public String getStatisPeriod() {
            return this.statisPeriod;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setToleranceValue(Long toleranceValue) {
            this.toleranceValue = toleranceValue;
            return this;
        }
        public Long getToleranceValue() {
            return this.toleranceValue;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setTrafficControlTargetId(String trafficControlTargetId) {
            this.trafficControlTargetId = trafficControlTargetId;
            return this;
        }
        public String getTrafficControlTargetId() {
            return this.trafficControlTargetId;
        }

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

}
