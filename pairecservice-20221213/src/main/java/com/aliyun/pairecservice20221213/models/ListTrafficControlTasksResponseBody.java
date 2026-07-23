// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTrafficControlTasksResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3AAA45F6-0798-5461-9360-81D133823CE7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of traffic control tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    /**
     * <p>The list of traffic control tasks.</p>
     */
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
        /**
         * <p>The list of value-based split points for the target.</p>
         */
        @NameInMap("SetValues")
        public java.util.List<Long> setValues;

        /**
         * <p>The list of time-based split points.</p>
         */
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
        /**
         * <p>The end time.</p>
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
         * <p>The creation time of the target.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-03T15:08:10.58+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The last update time of the target.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-21T16:26:58.57+08:00</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The item condition, in an array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;status&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
         */
        @NameInMap("ItemConditionArray")
        public String itemConditionArray;

        /**
         * <p>The item condition, in an expression format.</p>
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
         * <p>The name of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>target-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the traffic control target is for a new product recall.</p>
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
         * <p>recall-1</p>
         */
        @NameInMap("RecallName")
        public String recallName;

        /**
         * <p>The details of the split points.</p>
         */
        @NameInMap("SplitParts")
        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargetsSplitParts splitParts;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-25</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The statistics period.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("StatisPeriod")
        public String statisPeriod;

        /**
         * <p>The status of the traffic control target.</p>
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
         * <p>10</p>
         */
        @NameInMap("ToleranceValue")
        public Long toleranceValue;

        /**
         * <p>The traffic control target ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrafficControlTargetId")
        public String trafficControlTargetId;

        /**
         * <p>The traffic control task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrafficControlTaskId")
        public String trafficControlTaskId;

        /**
         * <p>The value of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
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

        public ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets setTrafficControlTaskId(String trafficControlTaskId) {
            this.trafficControlTaskId = trafficControlTaskId;
            return this;
        }
        public String getTrafficControlTaskId() {
            return this.trafficControlTaskId;
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
         * <p>The description of the traffic control task.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test task</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of effective scene IDs.</p>
         */
        @NameInMap("EffectiveSceneIds")
        public java.util.List<Integer> effectiveSceneIds;

        /**
         * <p>The list of effective scene names.</p>
         */
        @NameInMap("EffectiveSceneNameList")
        public java.util.List<String> effectiveSceneNameList;

        /**
         * <p>The list of effective scene names.</p>
         */
        @NameInMap("EffectiveSceneNames")
        public java.util.List<Integer> effectiveSceneNames;

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-25</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates whether the task has ever been published.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EverPublished")
        public Boolean everPublished;

        /**
         * <p>The execution schedule for the task. Valid values:</p>
         * <ul>
         * <li><p><code>Permanent</code>: The task runs indefinitely.</p>
         * </li>
         * <li><p><code>TimeRange</code>: The task runs within a specified time range. If you set this parameter to this value, you must also specify the <code>StartTime</code> and <code>EndTime</code> parameters.</p>
         * </li>
         * </ul>
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
         * <p>The name of the Flink resource.</p>
         * 
         * <strong>example:</strong>
         * <p>flink_test</p>
         */
        @NameInMap("FlinkResourceName")
        public String flinkResourceName;

        /**
         * <p>The creation time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-25T06:04:28.441Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The last update time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-25T06:04:28.441Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The item condition, in an array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;status&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
         */
        @NameInMap("ItemConditionArray")
        public String itemConditionArray;

        /**
         * <p>The item condition, in an expression format.</p>
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
         * <p>The name of the traffic control task.</p>
         * 
         * <strong>example:</strong>
         * <p>task_1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A comma-separated list of staging experiment IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        @NameInMap("PreExperimentIds")
        public String preExperimentIds;

        /**
         * <p>The staging environment status.</p>
         * 
         * <strong>example:</strong>
         * <p>Runnning</p>
         */
        @NameInMap("PrepubStatus")
        public String prepubStatus;

        /**
         * <p>A comma-separated list of production experiment IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>6,7</p>
         */
        @NameInMap("ProdExperimentIds")
        public String prodExperimentIds;

        /**
         * <p>The production environment status.</p>
         * 
         * <strong>example:</strong>
         * <p>Runnning</p>
         */
        @NameInMap("ProductStatus")
        public String productStatus;

        /**
         * <p>The scene ID. You can obtain this ID by calling the <code>ListScenes</code> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The name of the scene.</p>
         * 
         * <strong>example:</strong>
         * <p>home_feed</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The list of service IDs.</p>
         */
        @NameInMap("ServiceIdList")
        public java.util.List<Integer> serviceIdList;

        /**
         * <p>The list of bound engine service IDs.</p>
         */
        @NameInMap("ServiceIds")
        public java.util.List<String> serviceIds;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-25</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The behavior statistics expression.</p>
         * 
         * <strong>example:</strong>
         * <p>event=click</p>
         */
        @NameInMap("StatisBahaviorConditionExpress")
        public String statisBahaviorConditionExpress;

        /**
         * <p>The behavior statistics condition, in an array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;click&quot;,&quot;option&quot;:&quot;&lt;=&quot;,&quot;value&quot;:&quot;30&quot;}]</p>
         */
        @NameInMap("StatisBehaviorConditionArray")
        public String statisBehaviorConditionArray;

        /**
         * <p>The behavior statistics expression.</p>
         * 
         * <strong>example:</strong>
         * <p>event=exposure</p>
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
         * <p>The list of traffic control targets.</p>
         */
        @NameInMap("TrafficControlTargets")
        public java.util.List<ListTrafficControlTasksResponseBodyTrafficControlTasksTrafficControlTargets> trafficControlTargets;

        /**
         * <p>The traffic control task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrafficControlTaskId")
        public String trafficControlTaskId;

        /**
         * <p>The condition for the target user group, in an array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;gender&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;male&quot;}]</p>
         */
        @NameInMap("UserConditionArray")
        public String userConditionArray;

        /**
         * <p>The condition for the target user group, in an expression format.</p>
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

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setEffectiveSceneIds(java.util.List<Integer> effectiveSceneIds) {
            this.effectiveSceneIds = effectiveSceneIds;
            return this;
        }
        public java.util.List<Integer> getEffectiveSceneIds() {
            return this.effectiveSceneIds;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setEffectiveSceneNameList(java.util.List<String> effectiveSceneNameList) {
            this.effectiveSceneNameList = effectiveSceneNameList;
            return this;
        }
        public java.util.List<String> getEffectiveSceneNameList() {
            return this.effectiveSceneNameList;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setEffectiveSceneNames(java.util.List<Integer> effectiveSceneNames) {
            this.effectiveSceneNames = effectiveSceneNames;
            return this;
        }
        public java.util.List<Integer> getEffectiveSceneNames() {
            return this.effectiveSceneNames;
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

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setFlinkResourceId(String flinkResourceId) {
            this.flinkResourceId = flinkResourceId;
            return this;
        }
        public String getFlinkResourceId() {
            return this.flinkResourceId;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setFlinkResourceName(String flinkResourceName) {
            this.flinkResourceName = flinkResourceName;
            return this;
        }
        public String getFlinkResourceName() {
            return this.flinkResourceName;
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

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setPreExperimentIds(String preExperimentIds) {
            this.preExperimentIds = preExperimentIds;
            return this;
        }
        public String getPreExperimentIds() {
            return this.preExperimentIds;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setPrepubStatus(String prepubStatus) {
            this.prepubStatus = prepubStatus;
            return this;
        }
        public String getPrepubStatus() {
            return this.prepubStatus;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setProdExperimentIds(String prodExperimentIds) {
            this.prodExperimentIds = prodExperimentIds;
            return this;
        }
        public String getProdExperimentIds() {
            return this.prodExperimentIds;
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

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setServiceIdList(java.util.List<Integer> serviceIdList) {
            this.serviceIdList = serviceIdList;
            return this;
        }
        public java.util.List<Integer> getServiceIdList() {
            return this.serviceIdList;
        }

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setServiceIds(java.util.List<String> serviceIds) {
            this.serviceIds = serviceIds;
            return this;
        }
        public java.util.List<String> getServiceIds() {
            return this.serviceIds;
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

        public ListTrafficControlTasksResponseBodyTrafficControlTasks setStatisBehaviorConditionExpress(String statisBehaviorConditionExpress) {
            this.statisBehaviorConditionExpress = statisBehaviorConditionExpress;
            return this;
        }
        public String getStatisBehaviorConditionExpress() {
            return this.statisBehaviorConditionExpress;
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
