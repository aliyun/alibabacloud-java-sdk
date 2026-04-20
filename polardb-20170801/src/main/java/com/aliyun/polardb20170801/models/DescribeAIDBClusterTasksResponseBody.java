// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>polardb_ai</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <strong>example:</strong>
     * <p>3.1</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("Items")
    public java.util.List<DescribeAIDBClusterTasksResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>pc-2ze***</p>
     */
    @NameInMap("RelativeDBClusterId")
    public String relativeDBClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>train</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeAIDBClusterTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterTasksResponseBody self = new DescribeAIDBClusterTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterTasksResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeAIDBClusterTasksResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeAIDBClusterTasksResponseBody setItems(java.util.List<DescribeAIDBClusterTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAIDBClusterTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAIDBClusterTasksResponseBody setRelativeDBClusterId(String relativeDBClusterId) {
        this.relativeDBClusterId = relativeDBClusterId;
        return this;
    }
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
    }

    public DescribeAIDBClusterTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAIDBClusterTasksResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public static class DescribeAIDBClusterTasksResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-06-09T18:00:00Z</p>
         */
        @NameInMap("CompletedTime")
        public String completedTime;

        /**
         * <strong>example:</strong>
         * <p>2025-03-25T09:37:10Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBNodeDescription")
        public String DBNodeDescription;

        /**
         * <strong>example:</strong>
         * <p>pm-2ze***</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("DBNodeStatusDesc")
        public String DBNodeStatusDesc;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-i</p>
         */
        @NameInMap("DataZoneId")
        public String dataZoneId;

        /**
         * <strong>example:</strong>
         * <p>polardb_ai</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <strong>example:</strong>
         * <p>3.1</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ModelPath")
        public String modelPath;

        /**
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("ModelSource")
        public String modelSource;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RunningTimes")
        public String runningTimes;

        /**
         * <strong>example:</strong>
         * <p>2020-06-09T18:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>sft</p>
         */
        @NameInMap("TrainMode")
        public String trainMode;

        /**
         * <strong>example:</strong>
         * <p>lora</p>
         */
        @NameInMap("TrainType")
        public String trainType;

        public static DescribeAIDBClusterTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterTasksResponseBodyItems self = new DescribeAIDBClusterTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterTasksResponseBodyItems setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setDBNodeDescription(String DBNodeDescription) {
            this.DBNodeDescription = DBNodeDescription;
            return this;
        }
        public String getDBNodeDescription() {
            return this.DBNodeDescription;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setDBNodeStatus(String DBNodeStatus) {
            this.DBNodeStatus = DBNodeStatus;
            return this;
        }
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setDBNodeStatusDesc(String DBNodeStatusDesc) {
            this.DBNodeStatusDesc = DBNodeStatusDesc;
            return this;
        }
        public String getDBNodeStatusDesc() {
            return this.DBNodeStatusDesc;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setDataZoneId(String dataZoneId) {
            this.dataZoneId = dataZoneId;
            return this;
        }
        public String getDataZoneId() {
            return this.dataZoneId;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setModelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }
        public String getModelPath() {
            return this.modelPath;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setModelSource(String modelSource) {
            this.modelSource = modelSource;
            return this;
        }
        public String getModelSource() {
            return this.modelSource;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setRunningTimes(String runningTimes) {
            this.runningTimes = runningTimes;
            return this;
        }
        public String getRunningTimes() {
            return this.runningTimes;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setTrainMode(String trainMode) {
            this.trainMode = trainMode;
            return this;
        }
        public String getTrainMode() {
            return this.trainMode;
        }

        public DescribeAIDBClusterTasksResponseBodyItems setTrainType(String trainType) {
            this.trainType = trainType;
            return this;
        }
        public String getTrainType() {
            return this.trainType;
        }

    }

}
