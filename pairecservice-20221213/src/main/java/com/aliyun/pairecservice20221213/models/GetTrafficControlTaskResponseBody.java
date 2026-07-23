// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTaskResponseBody extends TeaModel {
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
    @NameInMap("EffectiveSceneNames")
    public java.util.List<String> effectiveSceneNames;

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
     * <p>true</p>
     */
    @NameInMap("EverPublished")
    public Boolean everPublished;

    /**
     * <p>The execution time.</p>
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
     * <p>The Flink resource name.</p>
     * 
     * <strong>example:</strong>
     * <p>flink_test</p>
     */
    @NameInMap("FlinkResourceName")
    public String flinkResourceName;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-11T02:27:38.208Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The last modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-11T02:27:38.208Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The item conditions in array format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;field&quot;:&quot;status&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
     */
    @NameInMap("ItemConditionArray")
    public String itemConditionArray;

    /**
     * <p>The item conditions in expression format.</p>
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
     * <p>task-1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The experiment IDs in the staging environment.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("PreExperimentIds")
    public String preExperimentIds;

    /**
     * <p>The staging environment status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("PrepubStatus")
    public String prepubStatus;

    /**
     * <p>The experiment IDs in the production environment.</p>
     * 
     * <strong>example:</strong>
     * <p>4,5,6</p>
     */
    @NameInMap("ProdExperimentIds")
    public String prodExperimentIds;

    /**
     * <p>The production environment status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ProductStatus")
    public String productStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The scene name.</p>
     * 
     * <strong>example:</strong>
     * <p>scene-2</p>
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
     * <p>The behavior statistics conditions in array format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;field&quot;:&quot;click&quot;,&quot;option&quot;:&quot;&lt;=&quot;,&quot;value&quot;:&quot;30&quot;}]</p>
     */
    @NameInMap("StatisBehaviorConditionArray")
    public String statisBehaviorConditionArray;

    /**
     * <p>The behavior statistics conditions in expression format.</p>
     * 
     * <strong>example:</strong>
     * <p>click=30</p>
     */
    @NameInMap("StatisBehaviorConditionExpress")
    public String statisBehaviorConditionExpress;

    /**
     * <p>The behavior statistics condition type.</p>
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
    public java.util.List<GetTrafficControlTaskResponseBodyTrafficControlTargets> trafficControlTargets;

    /**
     * <p>The ID of the traffic control task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TrafficControlTaskId")
    public String trafficControlTaskId;

    /**
     * <p>The target user group conditions in array format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;field&quot;:&quot;gender&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;male&quot;}]</p>
     */
    @NameInMap("UserConditionArray")
    public String userConditionArray;

    /**
     * <p>The target user group conditions in expression format.</p>
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

    public GetTrafficControlTaskResponseBody setEffectiveSceneIds(java.util.List<Integer> effectiveSceneIds) {
        this.effectiveSceneIds = effectiveSceneIds;
        return this;
    }
    public java.util.List<Integer> getEffectiveSceneIds() {
        return this.effectiveSceneIds;
    }

    public GetTrafficControlTaskResponseBody setEffectiveSceneNames(java.util.List<String> effectiveSceneNames) {
        this.effectiveSceneNames = effectiveSceneNames;
        return this;
    }
    public java.util.List<String> getEffectiveSceneNames() {
        return this.effectiveSceneNames;
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

    public GetTrafficControlTaskResponseBody setFlinkResourceId(String flinkResourceId) {
        this.flinkResourceId = flinkResourceId;
        return this;
    }
    public String getFlinkResourceId() {
        return this.flinkResourceId;
    }

    public GetTrafficControlTaskResponseBody setFlinkResourceName(String flinkResourceName) {
        this.flinkResourceName = flinkResourceName;
        return this;
    }
    public String getFlinkResourceName() {
        return this.flinkResourceName;
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

    public GetTrafficControlTaskResponseBody setPreExperimentIds(String preExperimentIds) {
        this.preExperimentIds = preExperimentIds;
        return this;
    }
    public String getPreExperimentIds() {
        return this.preExperimentIds;
    }

    public GetTrafficControlTaskResponseBody setPrepubStatus(String prepubStatus) {
        this.prepubStatus = prepubStatus;
        return this;
    }
    public String getPrepubStatus() {
        return this.prepubStatus;
    }

    public GetTrafficControlTaskResponseBody setProdExperimentIds(String prodExperimentIds) {
        this.prodExperimentIds = prodExperimentIds;
        return this;
    }
    public String getProdExperimentIds() {
        return this.prodExperimentIds;
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

    public GetTrafficControlTaskResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetTrafficControlTaskResponseBody setServiceIds(java.util.List<Integer> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<Integer> getServiceIds() {
        return this.serviceIds;
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
        /**
         * <p>The list of target value split points.</p>
         */
        @NameInMap("SetPoints")
        public java.util.List<Integer> setPoints;

        /**
         * <p>The list of control target set values.</p>
         */
        @NameInMap("SetValues")
        public java.util.List<Long> setValues;

        /**
         * <p>The time points for splitting the control target.</p>
         */
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
        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-25</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The control target event.</p>
         * 
         * <strong>example:</strong>
         * <p>click</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-25T06:04:28.441Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-25T06:04:28.441Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The item conditions in array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;status&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
         */
        @NameInMap("ItemConditionArray")
        public String itemConditionArray;

        /**
         * <p>The item conditions in expression format.</p>
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
         * <p>The name of the control target.</p>
         * 
         * <strong>example:</strong>
         * <p>target-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether this is a new product regulation.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NewProductRegulation")
        public Boolean newProductRegulation;

        /**
         * <p>The recall Policy Name.</p>
         * 
         * <strong>example:</strong>
         * <p>recall-1</p>
         */
        @NameInMap("RecallName")
        public String recallName;

        /**
         * <p>The split configuration of the control target.</p>
         */
        @NameInMap("SplitParts")
        public GetTrafficControlTaskResponseBodyTrafficControlTargetsSplitParts splitParts;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-25</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("StatisPeriod")
        public String statisPeriod;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Opened</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tolerance range of the control target.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ToleranceValue")
        public Long toleranceValue;

        /**
         * <p>The ID of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrafficControlTargetId")
        public String trafficControlTargetId;

        /**
         * <p>The ID of the traffic control task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrafficControlTaskId")
        public String trafficControlTaskId;

        /**
         * <p>The control target value.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
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

        public GetTrafficControlTaskResponseBodyTrafficControlTargets setTrafficControlTaskId(String trafficControlTaskId) {
            this.trafficControlTaskId = trafficControlTaskId;
            return this;
        }
        public String getTrafficControlTaskId() {
            return this.trafficControlTaskId;
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
