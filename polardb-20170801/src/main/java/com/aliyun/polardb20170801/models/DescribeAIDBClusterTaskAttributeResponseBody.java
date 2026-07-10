// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterTaskAttributeResponseBody extends TeaModel {
    /**
     * <p>The access information of the model in the test deployment scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;networkInterfaceId\&quot;:\&quot;eni-2zea***\&quot;,\&quot;port\&quot;:\&quot;8000\&quot;,\&quot;host\&quot;:\&quot;192.<strong>.</strong>.**\&quot;}</p>
     */
    @NameInMap("AccessInfo")
    public String accessInfo;

    /**
     * <p>The network type of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ClusterNetworkType")
    public String clusterNetworkType;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-12T03:45:13Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>task01</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-2ze99***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The training status. Valid values:</p>
     * <ul>
     * <li><strong>ACTIVATION</strong>: Training in progress.</li>
     * <li><strong>COMPLETED</strong>: Training succeeded.</li>
     * <li><strong>FAILED</strong>: Training failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    /**
     * <p>The training status. Valid values:</p>
     * <ul>
     * <li><strong>ACTIVATION</strong>: Training in progress.</li>
     * <li><strong>COMPLETED</strong>: Training succeeded.</li>
     * <li><strong>FAILED</strong>: Training failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("DBClusterStatusDesc")
    public String DBClusterStatusDesc;

    /**
     * <p>The engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb_ai</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version. Valid values:</p>
     * <ul>
     * <li><strong>3.1</strong>: model operator tuning.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3.1</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The datasets.</p>
     */
    @NameInMap("DataSets")
    public java.util.List<DescribeAIDBClusterTaskAttributeResponseBodyDataSets> dataSets;

    /**
     * <p>The additional information, including runtime parameters.</p>
     */
    @NameInMap("ExtraInfo")
    public java.util.List<java.util.Map<String, ?>> extraInfo;

    /**
     * <p>The type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>18</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("KindCode")
    public Long kindCode;

    /**
     * <p>The lock mode. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Locked.</li>
     * <li><strong>1</strong>: Unlocked.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The maintenance end time.</p>
     * 
     * <strong>example:</strong>
     * <p>12:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The maintenance start time.</p>
     * 
     * <strong>example:</strong>
     * <p>8:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    /**
     * <p>The list of output model paths in the model fine-tuning scenario.</p>
     */
    @NameInMap("ModelPath")
    public String modelPath;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>45D24263-7E3A-4140-9472-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task information.</p>
     */
    @NameInMap("TaskInfo")
    public java.util.List<DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo> taskInfo;

    @NameInMap("TuneArch")
    public String tuneArch;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-**********</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static DescribeAIDBClusterTaskAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterTaskAttributeResponseBody self = new DescribeAIDBClusterTaskAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setAccessInfo(String accessInfo) {
        this.accessInfo = accessInfo;
        return this;
    }
    public String getAccessInfo() {
        return this.accessInfo;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setClusterNetworkType(String clusterNetworkType) {
        this.clusterNetworkType = clusterNetworkType;
        return this;
    }
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setDBClusterStatusDesc(String DBClusterStatusDesc) {
        this.DBClusterStatusDesc = DBClusterStatusDesc;
        return this;
    }
    public String getDBClusterStatusDesc() {
        return this.DBClusterStatusDesc;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setDataSets(java.util.List<DescribeAIDBClusterTaskAttributeResponseBodyDataSets> dataSets) {
        this.dataSets = dataSets;
        return this;
    }
    public java.util.List<DescribeAIDBClusterTaskAttributeResponseBodyDataSets> getDataSets() {
        return this.dataSets;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setExtraInfo(java.util.List<java.util.Map<String, ?>> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getExtraInfo() {
        return this.extraInfo;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setKindCode(Long kindCode) {
        this.kindCode = kindCode;
        return this;
    }
    public Long getKindCode() {
        return this.kindCode;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setModelPath(String modelPath) {
        this.modelPath = modelPath;
        return this;
    }
    public String getModelPath() {
        return this.modelPath;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setTaskInfo(java.util.List<DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo> taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public java.util.List<DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo> getTaskInfo() {
        return this.taskInfo;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setTuneArch(String tuneArch) {
        this.tuneArch = tuneArch;
        return this;
    }
    public String getTuneArch() {
        return this.tuneArch;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeAIDBClusterTaskAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class DescribeAIDBClusterTaskAttributeResponseBodyDataSets extends TeaModel {
        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset02</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The dataset path.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_ai/datasets/train/grpo/dataset02/test-**.jsonl#1000</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The ratio of data split from the training set.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("SplitDatasetRatio")
        public String splitDatasetRatio;

        /**
         * <p>The type. Valid values:</p>
         * <ul>
         * <li><strong>train</strong>: training set.</li>
         * <li><strong>eval</strong>: validation set.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>train</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAIDBClusterTaskAttributeResponseBodyDataSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterTaskAttributeResponseBodyDataSets self = new DescribeAIDBClusterTaskAttributeResponseBodyDataSets();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyDataSets setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyDataSets setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyDataSets setSplitDatasetRatio(String splitDatasetRatio) {
            this.splitDatasetRatio = splitDatasetRatio;
            return this;
        }
        public String getSplitDatasetRatio() {
            return this.splitDatasetRatio;
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyDataSets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo extends TeaModel {
        /**
         * <p>The task completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-10T01:56:00Z</p>
         */
        @NameInMap("CompletedTime")
        public String completedTime;

        /**
         * <p>The foundation model.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen-1.7B</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The path of the custom model.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen-1.7B</p>
         */
        @NameInMap("ModelPath")
        public String modelPath;

        /**
         * <p>The model source. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: pre-trained model.</li>
         * <li><strong>custom</strong>: custom model.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("ModelSource")
        public String modelSource;

        /**
         * <p>The runtime parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;split_dataset_ratio&quot;: 0.1,&quot;train_mode&quot;: &quot;grpo&quot;,&quot;train_type&quot;: &quot;lora&quot;,&quot;num_epochs&quot;: 1,&quot;batch_size&quot;: 2,&quot;eval_batch_size&quot;: 2, &quot;num_generations&quot;: 2, &quot;learning_rate&quot;: &quot;1e-6&quot;, &quot;data_file_list&quot;: &quot;test-00000-of-00001.jsonl#1000&quot;, &quot;lora_rank&quot;: 8, &quot;lora_alpha&quot;: 32, &quot;external_plugins&quot;: &quot;/plugin/train/plugin.py&quot;, &quot;reward_funcs&quot;: &quot;format,external_countdown&quot;, &quot;gpu_memory_utilization&quot;: 0.4}</p>
         */
        @NameInMap("RunningTimes")
        public String runningTimes;

        /**
         * <p>The task start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-10T01:56:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>sft</strong>: SFT-efficient training.</li>
         * <li><strong>grpo</strong>: GRPO-reinforcement learning.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stf</p>
         */
        @NameInMap("TrainMode")
        public String trainMode;

        /**
         * <p>The training method. Valid values:</p>
         * <ul>
         * <li><strong>lora</strong></li>
         * <li><strong>full</strong>: full-parameter training.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lora</p>
         */
        @NameInMap("TrainType")
        public String trainType;

        public static DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo self = new DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo setModelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }
        public String getModelPath() {
            return this.modelPath;
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo setModelSource(String modelSource) {
            this.modelSource = modelSource;
            return this;
        }
        public String getModelSource() {
            return this.modelSource;
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo setRunningTimes(String runningTimes) {
            this.runningTimes = runningTimes;
            return this;
        }
        public String getRunningTimes() {
            return this.runningTimes;
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo setTrainMode(String trainMode) {
            this.trainMode = trainMode;
            return this;
        }
        public String getTrainMode() {
            return this.trainMode;
        }

        public DescribeAIDBClusterTaskAttributeResponseBodyTaskInfo setTrainType(String trainType) {
            this.trainType = trainType;
            return this;
        }
        public String getTrainType() {
            return this.trainType;
        }

    }

}
