// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class KnowledgeBase extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("AutoUpdateConfig")
    public KnowledgeBaseAutoUpdateConfig autoUpdateConfig;

    @NameInMap("ChunkConfig")
    public KnowledgeBaseChunkConfig chunkConfig;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("DataSources")
    public java.util.List<KnowledgeBaseDataSources> dataSources;

    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("Description")
    public String description;

    @NameInMap("EmbeddingConfig")
    public KnowledgeBaseEmbeddingConfig embeddingConfig;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("IndexColumnConfig")
    public KnowledgeBaseIndexColumnConfig indexColumnConfig;

    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    @NameInMap("KnowledgeBaseType")
    public String knowledgeBaseType;

    @NameInMap("MetaDataConfig")
    public KnowledgeBaseMetaDataConfig metaDataConfig;

    @NameInMap("Name")
    public String name;

    @NameInMap("OutputDir")
    public String outputDir;

    @NameInMap("RuntimeId")
    public String runtimeId;

    @NameInMap("VectorDBConfig")
    public KnowledgeBaseVectorDBConfig vectorDBConfig;

    @NameInMap("VersionName")
    public String versionName;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static KnowledgeBase build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBase self = new KnowledgeBase();
        return TeaModel.build(map, self);
    }

    public KnowledgeBase setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public KnowledgeBase setAutoUpdateConfig(KnowledgeBaseAutoUpdateConfig autoUpdateConfig) {
        this.autoUpdateConfig = autoUpdateConfig;
        return this;
    }
    public KnowledgeBaseAutoUpdateConfig getAutoUpdateConfig() {
        return this.autoUpdateConfig;
    }

    public KnowledgeBase setChunkConfig(KnowledgeBaseChunkConfig chunkConfig) {
        this.chunkConfig = chunkConfig;
        return this;
    }
    public KnowledgeBaseChunkConfig getChunkConfig() {
        return this.chunkConfig;
    }

    public KnowledgeBase setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public KnowledgeBase setDataSources(java.util.List<KnowledgeBaseDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<KnowledgeBaseDataSources> getDataSources() {
        return this.dataSources;
    }

    public KnowledgeBase setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public KnowledgeBase setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KnowledgeBase setEmbeddingConfig(KnowledgeBaseEmbeddingConfig embeddingConfig) {
        this.embeddingConfig = embeddingConfig;
        return this;
    }
    public KnowledgeBaseEmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    public KnowledgeBase setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public KnowledgeBase setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public KnowledgeBase setIndexColumnConfig(KnowledgeBaseIndexColumnConfig indexColumnConfig) {
        this.indexColumnConfig = indexColumnConfig;
        return this;
    }
    public KnowledgeBaseIndexColumnConfig getIndexColumnConfig() {
        return this.indexColumnConfig;
    }

    public KnowledgeBase setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public KnowledgeBase setKnowledgeBaseType(String knowledgeBaseType) {
        this.knowledgeBaseType = knowledgeBaseType;
        return this;
    }
    public String getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    public KnowledgeBase setMetaDataConfig(KnowledgeBaseMetaDataConfig metaDataConfig) {
        this.metaDataConfig = metaDataConfig;
        return this;
    }
    public KnowledgeBaseMetaDataConfig getMetaDataConfig() {
        return this.metaDataConfig;
    }

    public KnowledgeBase setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public KnowledgeBase setOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }
    public String getOutputDir() {
        return this.outputDir;
    }

    public KnowledgeBase setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public String getRuntimeId() {
        return this.runtimeId;
    }

    public KnowledgeBase setVectorDBConfig(KnowledgeBaseVectorDBConfig vectorDBConfig) {
        this.vectorDBConfig = vectorDBConfig;
        return this;
    }
    public KnowledgeBaseVectorDBConfig getVectorDBConfig() {
        return this.vectorDBConfig;
    }

    public KnowledgeBase setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public KnowledgeBase setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class KnowledgeBaseAutoUpdateConfigEcsSpecs extends TeaModel {
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

        public static KnowledgeBaseAutoUpdateConfigEcsSpecs build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseAutoUpdateConfigEcsSpecs self = new KnowledgeBaseAutoUpdateConfigEcsSpecs();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseAutoUpdateConfigEcsSpecs setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public KnowledgeBaseAutoUpdateConfigEcsSpecs setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public KnowledgeBaseAutoUpdateConfigEcsSpecs setGPU(Integer GPU) {
            this.GPU = GPU;
            return this;
        }
        public Integer getGPU() {
            return this.GPU;
        }

        public KnowledgeBaseAutoUpdateConfigEcsSpecs setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public KnowledgeBaseAutoUpdateConfigEcsSpecs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public KnowledgeBaseAutoUpdateConfigEcsSpecs setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public KnowledgeBaseAutoUpdateConfigEcsSpecs setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public KnowledgeBaseAutoUpdateConfigEcsSpecs setSharedMemory(Integer sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        public KnowledgeBaseAutoUpdateConfigEcsSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class KnowledgeBaseAutoUpdateConfigEmbeddingConfig extends TeaModel {
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

        public static KnowledgeBaseAutoUpdateConfigEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseAutoUpdateConfigEmbeddingConfig self = new KnowledgeBaseAutoUpdateConfigEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseAutoUpdateConfigEmbeddingConfig setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public KnowledgeBaseAutoUpdateConfigEmbeddingConfig setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

    }

    public static class KnowledgeBaseAutoUpdateConfig extends TeaModel {
        /**
         * <p>运行资源配置</p>
         */
        @NameInMap("EcsSpecs")
        public java.util.List<KnowledgeBaseAutoUpdateConfigEcsSpecs> ecsSpecs;

        /**
         * <p>Embedding配置</p>
         */
        @NameInMap("EmbeddingConfig")
        public KnowledgeBaseAutoUpdateConfigEmbeddingConfig embeddingConfig;

        /**
         * <p>任务最大运行时间</p>
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

        public static KnowledgeBaseAutoUpdateConfig build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseAutoUpdateConfig self = new KnowledgeBaseAutoUpdateConfig();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseAutoUpdateConfig setEcsSpecs(java.util.List<KnowledgeBaseAutoUpdateConfigEcsSpecs> ecsSpecs) {
            this.ecsSpecs = ecsSpecs;
            return this;
        }
        public java.util.List<KnowledgeBaseAutoUpdateConfigEcsSpecs> getEcsSpecs() {
            return this.ecsSpecs;
        }

        public KnowledgeBaseAutoUpdateConfig setEmbeddingConfig(KnowledgeBaseAutoUpdateConfigEmbeddingConfig embeddingConfig) {
            this.embeddingConfig = embeddingConfig;
            return this;
        }
        public KnowledgeBaseAutoUpdateConfigEmbeddingConfig getEmbeddingConfig() {
            return this.embeddingConfig;
        }

        public KnowledgeBaseAutoUpdateConfig setMaxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }
        public Integer getMaxRunningTimeInSeconds() {
            return this.maxRunningTimeInSeconds;
        }

        public KnowledgeBaseAutoUpdateConfig setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public KnowledgeBaseAutoUpdateConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public KnowledgeBaseAutoUpdateConfig setUserVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }
        public UserVpc getUserVpc() {
            return this.userVpc;
        }

    }

    public static class KnowledgeBaseChunkConfig extends TeaModel {
        /**
         * <p>分块时长</p>
         */
        @NameInMap("ChunkDuration")
        public Integer chunkDuration;

        /**
         * <p>分块重叠大小</p>
         */
        @NameInMap("ChunkOverlap")
        public Integer chunkOverlap;

        /**
         * <p>分块大小</p>
         */
        @NameInMap("ChunkSize")
        public Integer chunkSize;

        /**
         * <p>分块策略</p>
         */
        @NameInMap("ChunkStrategy")
        public String chunkStrategy;

        public static KnowledgeBaseChunkConfig build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseChunkConfig self = new KnowledgeBaseChunkConfig();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseChunkConfig setChunkDuration(Integer chunkDuration) {
            this.chunkDuration = chunkDuration;
            return this;
        }
        public Integer getChunkDuration() {
            return this.chunkDuration;
        }

        public KnowledgeBaseChunkConfig setChunkOverlap(Integer chunkOverlap) {
            this.chunkOverlap = chunkOverlap;
            return this;
        }
        public Integer getChunkOverlap() {
            return this.chunkOverlap;
        }

        public KnowledgeBaseChunkConfig setChunkSize(Integer chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }
        public Integer getChunkSize() {
            return this.chunkSize;
        }

        public KnowledgeBaseChunkConfig setChunkStrategy(String chunkStrategy) {
            this.chunkStrategy = chunkStrategy;
            return this;
        }
        public String getChunkStrategy() {
            return this.chunkStrategy;
        }

    }

    public static class KnowledgeBaseDataSources extends TeaModel {
        /**
         * <p>统一资源识别码</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static KnowledgeBaseDataSources build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseDataSources self = new KnowledgeBaseDataSources();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseDataSources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class KnowledgeBaseEmbeddingConfig extends TeaModel {
        /**
         * <p>Embedding连接ID</p>
         */
        @NameInMap("ConnectionId")
        public String connectionId;

        /**
         * <p>Embedding连接名称</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>模型</p>
         */
        @NameInMap("Model")
        public String model;

        public static KnowledgeBaseEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseEmbeddingConfig self = new KnowledgeBaseEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseEmbeddingConfig setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public KnowledgeBaseEmbeddingConfig setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public KnowledgeBaseEmbeddingConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

    }

    public static class KnowledgeBaseIndexColumnConfigColumnDefinitions extends TeaModel {
        /**
         * <p>列Key</p>
         */
        @NameInMap("Key")
        public String key;

        public static KnowledgeBaseIndexColumnConfigColumnDefinitions build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseIndexColumnConfigColumnDefinitions self = new KnowledgeBaseIndexColumnConfigColumnDefinitions();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseIndexColumnConfigColumnDefinitions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class KnowledgeBaseIndexColumnConfigContentColumns extends TeaModel {
        /**
         * <p>列Key</p>
         */
        @NameInMap("Key")
        public String key;

        public static KnowledgeBaseIndexColumnConfigContentColumns build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseIndexColumnConfigContentColumns self = new KnowledgeBaseIndexColumnConfigContentColumns();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseIndexColumnConfigContentColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class KnowledgeBaseIndexColumnConfigEmbeddingColumns extends TeaModel {
        /**
         * <p>列Key</p>
         */
        @NameInMap("Key")
        public String key;

        public static KnowledgeBaseIndexColumnConfigEmbeddingColumns build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseIndexColumnConfigEmbeddingColumns self = new KnowledgeBaseIndexColumnConfigEmbeddingColumns();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseIndexColumnConfigEmbeddingColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class KnowledgeBaseIndexColumnConfig extends TeaModel {
        /**
         * <p>所有列名</p>
         */
        @NameInMap("ColumnDefinitions")
        public java.util.List<KnowledgeBaseIndexColumnConfigColumnDefinitions> columnDefinitions;

        /**
         * <p>内容检索列</p>
         */
        @NameInMap("ContentColumns")
        public java.util.List<KnowledgeBaseIndexColumnConfigContentColumns> contentColumns;

        /**
         * <p>Embedding列</p>
         */
        @NameInMap("EmbeddingColumns")
        public java.util.List<KnowledgeBaseIndexColumnConfigEmbeddingColumns> embeddingColumns;

        public static KnowledgeBaseIndexColumnConfig build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseIndexColumnConfig self = new KnowledgeBaseIndexColumnConfig();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseIndexColumnConfig setColumnDefinitions(java.util.List<KnowledgeBaseIndexColumnConfigColumnDefinitions> columnDefinitions) {
            this.columnDefinitions = columnDefinitions;
            return this;
        }
        public java.util.List<KnowledgeBaseIndexColumnConfigColumnDefinitions> getColumnDefinitions() {
            return this.columnDefinitions;
        }

        public KnowledgeBaseIndexColumnConfig setContentColumns(java.util.List<KnowledgeBaseIndexColumnConfigContentColumns> contentColumns) {
            this.contentColumns = contentColumns;
            return this;
        }
        public java.util.List<KnowledgeBaseIndexColumnConfigContentColumns> getContentColumns() {
            return this.contentColumns;
        }

        public KnowledgeBaseIndexColumnConfig setEmbeddingColumns(java.util.List<KnowledgeBaseIndexColumnConfigEmbeddingColumns> embeddingColumns) {
            this.embeddingColumns = embeddingColumns;
            return this;
        }
        public java.util.List<KnowledgeBaseIndexColumnConfigEmbeddingColumns> getEmbeddingColumns() {
            return this.embeddingColumns;
        }

    }

    public static class KnowledgeBaseMetaDataConfigCustomMetaData extends TeaModel {
        /**
         * <p>元数据Key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>引用次数</p>
         */
        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        /**
         * <p>值的个数</p>
         */
        @NameInMap("ValueCount")
        public Integer valueCount;

        /**
         * <p>元数据Value类型</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static KnowledgeBaseMetaDataConfigCustomMetaData build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseMetaDataConfigCustomMetaData self = new KnowledgeBaseMetaDataConfigCustomMetaData();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseMetaDataConfigCustomMetaData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public KnowledgeBaseMetaDataConfigCustomMetaData setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public KnowledgeBaseMetaDataConfigCustomMetaData setValueCount(Integer valueCount) {
            this.valueCount = valueCount;
            return this;
        }
        public Integer getValueCount() {
            return this.valueCount;
        }

        public KnowledgeBaseMetaDataConfigCustomMetaData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class KnowledgeBaseMetaDataConfig extends TeaModel {
        /**
         * <p>自定义元数据</p>
         */
        @NameInMap("CustomMetaData")
        public java.util.List<KnowledgeBaseMetaDataConfigCustomMetaData> customMetaData;

        public static KnowledgeBaseMetaDataConfig build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseMetaDataConfig self = new KnowledgeBaseMetaDataConfig();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseMetaDataConfig setCustomMetaData(java.util.List<KnowledgeBaseMetaDataConfigCustomMetaData> customMetaData) {
            this.customMetaData = customMetaData;
            return this;
        }
        public java.util.List<KnowledgeBaseMetaDataConfigCustomMetaData> getCustomMetaData() {
            return this.customMetaData;
        }

    }

    public static class KnowledgeBaseVectorDBConfig extends TeaModel {
        /**
         * <p>Collectioin名称</p>
         */
        @NameInMap("CollectionName")
        public String collectionName;

        /**
         * <p>Embedding连接ID</p>
         */
        @NameInMap("ConnectionId")
        public String connectionId;

        /**
         * <p>VectorDB连接名称</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>VectorDB类型</p>
         */
        @NameInMap("VectorDBType")
        public String vectorDBType;

        public static KnowledgeBaseVectorDBConfig build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseVectorDBConfig self = new KnowledgeBaseVectorDBConfig();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseVectorDBConfig setCollectionName(String collectionName) {
            this.collectionName = collectionName;
            return this;
        }
        public String getCollectionName() {
            return this.collectionName;
        }

        public KnowledgeBaseVectorDBConfig setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public KnowledgeBaseVectorDBConfig setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public KnowledgeBaseVectorDBConfig setVectorDBType(String vectorDBType) {
            this.vectorDBType = vectorDBType;
            return this;
        }
        public String getVectorDBType() {
            return this.vectorDBType;
        }

    }

}
