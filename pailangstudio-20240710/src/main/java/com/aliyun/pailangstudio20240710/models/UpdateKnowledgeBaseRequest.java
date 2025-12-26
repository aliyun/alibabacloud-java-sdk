// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseRequest extends TeaModel {
    @NameInMap("AutoUpdateConfig")
    public UpdateKnowledgeBaseRequestAutoUpdateConfig autoUpdateConfig;

    @NameInMap("BindRuntime")
    public Boolean bindRuntime;

    @NameInMap("Description")
    public String description;

    @NameInMap("MetaDataConfig")
    public UpdateKnowledgeBaseRequestMetaDataConfig metaDataConfig;

    @NameInMap("RuntimeId")
    public String runtimeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseRequest self = new UpdateKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseRequest setAutoUpdateConfig(UpdateKnowledgeBaseRequestAutoUpdateConfig autoUpdateConfig) {
        this.autoUpdateConfig = autoUpdateConfig;
        return this;
    }
    public UpdateKnowledgeBaseRequestAutoUpdateConfig getAutoUpdateConfig() {
        return this.autoUpdateConfig;
    }

    public UpdateKnowledgeBaseRequest setBindRuntime(Boolean bindRuntime) {
        this.bindRuntime = bindRuntime;
        return this;
    }
    public Boolean getBindRuntime() {
        return this.bindRuntime;
    }

    public UpdateKnowledgeBaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeBaseRequest setMetaDataConfig(UpdateKnowledgeBaseRequestMetaDataConfig metaDataConfig) {
        this.metaDataConfig = metaDataConfig;
        return this;
    }
    public UpdateKnowledgeBaseRequestMetaDataConfig getMetaDataConfig() {
        return this.metaDataConfig;
    }

    public UpdateKnowledgeBaseRequest setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public String getRuntimeId() {
        return this.runtimeId;
    }

    public UpdateKnowledgeBaseRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs extends TeaModel {
        /**
         * <p>CPU核数</p>
         */
        @NameInMap("CPU")
        public Integer CPU;

        /**
         * <p>驱动版本</p>
         */
        @NameInMap("Driver")
        public String driver;

        /**
         * <p>GPU卡数</p>
         */
        @NameInMap("GPU")
        public Integer GPU;

        /**
         * <p>GPU类型</p>
         */
        @NameInMap("GPUType")
        public String GPUType;

        /**
         * <p>机型名称</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>内存大小</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>副本数量</p>
         */
        @NameInMap("PodCount")
        public Integer podCount;

        /**
         * <p>共享内存容量</p>
         */
        @NameInMap("SharedMemory")
        public Integer sharedMemory;

        /**
         * <p>节点类型</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs self = new UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs setGPU(Integer GPU) {
            this.GPU = GPU;
            return this;
        }
        public Integer getGPU() {
            return this.GPU;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs setSharedMemory(Integer sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateKnowledgeBaseRequestAutoUpdateConfigEmbeddingConfig extends TeaModel {
        /**
         * <p>Embedding分批大小</p>
         */
        @NameInMap("BatchSize")
        public Integer batchSize;

        /**
         * <p>Embedding并发数</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        public static UpdateKnowledgeBaseRequestAutoUpdateConfigEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseRequestAutoUpdateConfigEmbeddingConfig self = new UpdateKnowledgeBaseRequestAutoUpdateConfigEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfigEmbeddingConfig setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfigEmbeddingConfig setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

    }

    public static class UpdateKnowledgeBaseRequestAutoUpdateConfig extends TeaModel {
        /**
         * <p>运行资源配置</p>
         */
        @NameInMap("EcsSpecs")
        public java.util.List<UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs> ecsSpecs;

        /**
         * <p>Embedding配置</p>
         */
        @NameInMap("EmbeddingConfig")
        public UpdateKnowledgeBaseRequestAutoUpdateConfigEmbeddingConfig embeddingConfig;

        /**
         * <p>任务最大运行时间</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("MaxRunningTimeInSeconds")
        public Integer maxRunningTimeInSeconds;

        /**
         * <p>资源组ID</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>知识库自动更新状态</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>用户VPC配置</p>
         */
        @NameInMap("UserVpc")
        public UserVpc userVpc;

        public static UpdateKnowledgeBaseRequestAutoUpdateConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseRequestAutoUpdateConfig self = new UpdateKnowledgeBaseRequestAutoUpdateConfig();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfig setEcsSpecs(java.util.List<UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs> ecsSpecs) {
            this.ecsSpecs = ecsSpecs;
            return this;
        }
        public java.util.List<UpdateKnowledgeBaseRequestAutoUpdateConfigEcsSpecs> getEcsSpecs() {
            return this.ecsSpecs;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfig setEmbeddingConfig(UpdateKnowledgeBaseRequestAutoUpdateConfigEmbeddingConfig embeddingConfig) {
            this.embeddingConfig = embeddingConfig;
            return this;
        }
        public UpdateKnowledgeBaseRequestAutoUpdateConfigEmbeddingConfig getEmbeddingConfig() {
            return this.embeddingConfig;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfig setMaxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }
        public Integer getMaxRunningTimeInSeconds() {
            return this.maxRunningTimeInSeconds;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfig setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateKnowledgeBaseRequestAutoUpdateConfig setUserVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }
        public UserVpc getUserVpc() {
            return this.userVpc;
        }

    }

    public static class UpdateKnowledgeBaseRequestMetaDataConfigCustomMetaData extends TeaModel {
        /**
         * <p>元数据Key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>元数据Value类型</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static UpdateKnowledgeBaseRequestMetaDataConfigCustomMetaData build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseRequestMetaDataConfigCustomMetaData self = new UpdateKnowledgeBaseRequestMetaDataConfigCustomMetaData();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseRequestMetaDataConfigCustomMetaData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateKnowledgeBaseRequestMetaDataConfigCustomMetaData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class UpdateKnowledgeBaseRequestMetaDataConfig extends TeaModel {
        /**
         * <p>自定义元数据</p>
         */
        @NameInMap("CustomMetaData")
        public java.util.List<UpdateKnowledgeBaseRequestMetaDataConfigCustomMetaData> customMetaData;

        public static UpdateKnowledgeBaseRequestMetaDataConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseRequestMetaDataConfig self = new UpdateKnowledgeBaseRequestMetaDataConfig();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseRequestMetaDataConfig setCustomMetaData(java.util.List<UpdateKnowledgeBaseRequestMetaDataConfigCustomMetaData> customMetaData) {
            this.customMetaData = customMetaData;
            return this;
        }
        public java.util.List<UpdateKnowledgeBaseRequestMetaDataConfigCustomMetaData> getCustomMetaData() {
            return this.customMetaData;
        }

    }

}
