// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTrafficControlTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("TrafficControlTasks")
    public java.util.List<ListTrafficControlTasksResponseBodyTrafficControlTasks> trafficControlTasks;

    public static ListTrafficControlTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficControlTasksResponseBody self = new ListTrafficControlTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrafficControlTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrafficControlTasksResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListTrafficControlTasksResponseBody setTrafficControlTasks(java.util.List<ListTrafficControlTasksResponseBodyTrafficControlTasks> trafficControlTasks) {
        this.trafficControlTasks = trafficControlTasks;
        return this;
    }
    public java.util.List<ListTrafficControlTasksResponseBodyTrafficControlTasks> getTrafficControlTasks() {
        return this.trafficControlTasks;
    }

    public static class ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargetsSplitParts extends TeaModel {
        @NameInMap("SetValues")
        public java.util.List<Long> setValues;

        @NameInMap("TimePoints")
        public java.util.List<Long> timePoints;

        public static ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargetsSplitParts build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargetsSplitParts self = new ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargetsSplitParts();
            return TeaModel.build(map, self);
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargetsSplitParts setSetValues(java.util.List<Long> setValues) {
            this.setValues = setValues;
            return this;
        }
        public java.util.List<Long> getSetValues() {
            return this.setValues;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargetsSplitParts setTimePoints(java.util.List<Long> timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public java.util.List<Long> getTimePoints() {
            return this.timePoints;
        }

    }

    public static class ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets extends TeaModel {
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
        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargetsSplitParts splitParts;

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

        public static ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets self = new ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets();
            return TeaModel.build(map, self);
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setItemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setItemConditionExpress(String itemConditionExpress) {
            this.itemConditionExpress = itemConditionExpress;
            return this;
        }
        public String getItemConditionExpress() {
            return this.itemConditionExpress;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setItemConditionType(String itemConditionType) {
            this.itemConditionType = itemConditionType;
            return this;
        }
        public String getItemConditionType() {
            return this.itemConditionType;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setNewProductRegulation(Boolean newProductRegulation) {
            this.newProductRegulation = newProductRegulation;
            return this;
        }
        public Boolean getNewProductRegulation() {
            return this.newProductRegulation;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setRecallName(String recallName) {
            this.recallName = recallName;
            return this;
        }
        public String getRecallName() {
            return this.recallName;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setSplitParts(ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargetsSplitParts splitParts) {
            this.splitParts = splitParts;
            return this;
        }
        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargetsSplitParts getSplitParts() {
            return this.splitParts;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setStatisPeriod(String statisPeriod) {
            this.statisPeriod = statisPeriod;
            return this;
        }
        public String getStatisPeriod() {
            return this.statisPeriod;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setToleranceValue(Long toleranceValue) {
            this.toleranceValue = toleranceValue;
            return this;
        }
        public Long getToleranceValue() {
            return this.toleranceValue;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setTrafficControlTargetId(String trafficControlTargetId) {
            this.trafficControlTargetId = trafficControlTargetId;
            return this;
        }
        public String getTrafficControlTargetId() {
            return this.trafficControlTargetId;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class ListTrafficControlTasksResponseBodyTrafficControlTasks extends TeaModel {
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

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StatisBahaviorConditionExpress")
        public String statisBahaviorConditionExpress;

        @NameInMap("StatisBehaviorConditionArray")
        public String statisBehaviorConditionArray;

        @NameInMap("StatisBehaviorConditionType")
        public String statisBehaviorConditionType;

        @NameInMap("TrafficControlTargets")
        public java.util.List<ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets> trafficControlTargets;

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

        public static ListTrafficControlTasksResponseBodyTrafficControlTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficControlTasksResponseBodyTrafficControlTasks self = new ListTrafficControlTasksResponseBodyTrafficControlTasks();
            return TeaModel.build(map, self);
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setBehaviorTableMetaId(String behaviorTableMetaId) {
            this.behaviorTableMetaId = behaviorTableMetaId;
            return this;
        }
        public String getBehaviorTableMetaId() {
            return this.behaviorTableMetaId;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setControlGranularity(String controlGranularity) {
            this.controlGranularity = controlGranularity;
            return this;
        }
        public String getControlGranularity() {
            return this.controlGranularity;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setControlLogic(String controlLogic) {
            this.controlLogic = controlLogic;
            return this;
        }
        public String getControlLogic() {
            return this.controlLogic;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setControlType(String controlType) {
            this.controlType = controlType;
            return this;
        }
        public String getControlType() {
            return this.controlType;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setEverPublished(Boolean everPublished) {
            this.everPublished = everPublished;
            return this;
        }
        public Boolean getEverPublished() {
            return this.everPublished;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setExecutionTime(String executionTime) {
            this.executionTime = executionTime;
            return this;
        }
        public String getExecutionTime() {
            return this.executionTime;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setItemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setItemConditionExpress(String itemConditionExpress) {
            this.itemConditionExpress = itemConditionExpress;
            return this;
        }
        public String getItemConditionExpress() {
            return this.itemConditionExpress;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setItemConditionType(String itemConditionType) {
            this.itemConditionType = itemConditionType;
            return this;
        }
        public String getItemConditionType() {
            return this.itemConditionType;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setItemTableMetaId(String itemTableMetaId) {
            this.itemTableMetaId = itemTableMetaId;
            return this;
        }
        public String getItemTableMetaId() {
            return this.itemTableMetaId;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setPrepubStatus(String prepubStatus) {
            this.prepubStatus = prepubStatus;
            return this;
        }
        public String getPrepubStatus() {
            return this.prepubStatus;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setProductStatus(String productStatus) {
            this.productStatus = productStatus;
            return this;
        }
        public String getProductStatus() {
            return this.productStatus;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setStatisBahaviorConditionExpress(String statisBahaviorConditionExpress) {
            this.statisBahaviorConditionExpress = statisBahaviorConditionExpress;
            return this;
        }
        public String getStatisBahaviorConditionExpress() {
            return this.statisBahaviorConditionExpress;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setStatisBehaviorConditionArray(String statisBehaviorConditionArray) {
            this.statisBehaviorConditionArray = statisBehaviorConditionArray;
            return this;
        }
        public String getStatisBehaviorConditionArray() {
            return this.statisBehaviorConditionArray;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setStatisBehaviorConditionType(String statisBehaviorConditionType) {
            this.statisBehaviorConditionType = statisBehaviorConditionType;
            return this;
        }
        public String getStatisBehaviorConditionType() {
            return this.statisBehaviorConditionType;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setTrafficControlTargets(java.util.List<ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets> trafficControlTargets) {
            this.trafficControlTargets = trafficControlTargets;
            return this;
        }
        public java.util.List<ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets> getTrafficControlTargets() {
            return this.trafficControlTargets;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setTrafficControlTaskId(String trafficControlTaskId) {
            this.trafficControlTaskId = trafficControlTaskId;
            return this;
        }
        public String getTrafficControlTaskId() {
            return this.trafficControlTaskId;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setUserConditionArray(String userConditionArray) {
            this.userConditionArray = userConditionArray;
            return this;
        }
        public String getUserConditionArray() {
            return this.userConditionArray;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setUserConditionExpress(String userConditionExpress) {
            this.userConditionExpress = userConditionExpress;
            return this;
        }
        public String getUserConditionExpress() {
            return this.userConditionExpress;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setUserConditionType(String userConditionType) {
            this.userConditionType = userConditionType;
            return this;
        }
        public String getUserConditionType() {
            return this.userConditionType;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setUserTableMetaId(String userTableMetaId) {
            this.userTableMetaId = userTableMetaId;
            return this;
        }
        public String getUserTableMetaId() {
            return this.userTableMetaId;
        }

    }

}
