// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("AutoUpdateConfig")
    public GetKnowledgeBaseResponseBodyAutoUpdateConfig autoUpdateConfig;

    @NameInMap("ChunkConfig")
    public GetKnowledgeBaseResponseBodyChunkConfig chunkConfig;

    /**
     * <strong>example:</strong>
     * <p>2485765****023475</p>
     */
    @NameInMap("Creator")
    public String creator;

    @NameInMap("DataSources")
    public java.util.List<GetKnowledgeBaseResponseBodyDataSources> dataSources;

    /**
     * <strong>example:</strong>
     * <p>d-cupbwkk5us9xpjz870</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <strong>example:</strong>
     * <p>This is a description of the knowledge base.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EmbeddingConfig")
    public GetKnowledgeBaseResponseBodyEmbeddingConfig embeddingConfig;

    /**
     * <strong>example:</strong>
     * <p>2024-12-15T14:46:23Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2025-12-18T19:32:58Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("IndexColumnConfig")
    public GetKnowledgeBaseResponseBodyIndexColumnConfig indexColumnConfig;

    /**
     * <strong>example:</strong>
     * <p>d-ksicx823d</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <strong>example:</strong>
     * <p>TEXT</p>
     */
    @NameInMap("KnowledgeBaseType")
    public String knowledgeBaseType;

    @NameInMap("MetaDataConfig")
    public GetKnowledgeBaseResponseBodyMetaDataConfig metaDataConfig;

    /**
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/langstudio/output/</p>
     */
    @NameInMap("OutputDir")
    public String outputDir;

    /**
     * <strong>example:</strong>
     * <p>963BD7F9-0C02-5594-9550-BCC6DD43E3C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rtime-apje******beaz</p>
     */
    @NameInMap("RuntimeId")
    public String runtimeId;

    @NameInMap("VectorDBConfig")
    public GetKnowledgeBaseResponseBodyVectorDBConfig vectorDBConfig;

    @NameInMap("VersionName")
    public String versionName;

    /**
     * <strong>example:</strong>
     * <p>478**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseResponseBody self = new GetKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetKnowledgeBaseResponseBody setAutoUpdateConfig(GetKnowledgeBaseResponseBodyAutoUpdateConfig autoUpdateConfig) {
        this.autoUpdateConfig = autoUpdateConfig;
        return this;
    }
    public GetKnowledgeBaseResponseBodyAutoUpdateConfig getAutoUpdateConfig() {
        return this.autoUpdateConfig;
    }

    public GetKnowledgeBaseResponseBody setChunkConfig(GetKnowledgeBaseResponseBodyChunkConfig chunkConfig) {
        this.chunkConfig = chunkConfig;
        return this;
    }
    public GetKnowledgeBaseResponseBodyChunkConfig getChunkConfig() {
        return this.chunkConfig;
    }

    public GetKnowledgeBaseResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetKnowledgeBaseResponseBody setDataSources(java.util.List<GetKnowledgeBaseResponseBodyDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<GetKnowledgeBaseResponseBodyDataSources> getDataSources() {
        return this.dataSources;
    }

    public GetKnowledgeBaseResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public GetKnowledgeBaseResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetKnowledgeBaseResponseBody setEmbeddingConfig(GetKnowledgeBaseResponseBodyEmbeddingConfig embeddingConfig) {
        this.embeddingConfig = embeddingConfig;
        return this;
    }
    public GetKnowledgeBaseResponseBodyEmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    public GetKnowledgeBaseResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetKnowledgeBaseResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetKnowledgeBaseResponseBody setIndexColumnConfig(GetKnowledgeBaseResponseBodyIndexColumnConfig indexColumnConfig) {
        this.indexColumnConfig = indexColumnConfig;
        return this;
    }
    public GetKnowledgeBaseResponseBodyIndexColumnConfig getIndexColumnConfig() {
        return this.indexColumnConfig;
    }

    public GetKnowledgeBaseResponseBody setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public GetKnowledgeBaseResponseBody setKnowledgeBaseType(String knowledgeBaseType) {
        this.knowledgeBaseType = knowledgeBaseType;
        return this;
    }
    public String getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    public GetKnowledgeBaseResponseBody setMetaDataConfig(GetKnowledgeBaseResponseBodyMetaDataConfig metaDataConfig) {
        this.metaDataConfig = metaDataConfig;
        return this;
    }
    public GetKnowledgeBaseResponseBodyMetaDataConfig getMetaDataConfig() {
        return this.metaDataConfig;
    }

    public GetKnowledgeBaseResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetKnowledgeBaseResponseBody setOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }
    public String getOutputDir() {
        return this.outputDir;
    }

    public GetKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgeBaseResponseBody setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public String getRuntimeId() {
        return this.runtimeId;
    }

    public GetKnowledgeBaseResponseBody setVectorDBConfig(GetKnowledgeBaseResponseBodyVectorDBConfig vectorDBConfig) {
        this.vectorDBConfig = vectorDBConfig;
        return this;
    }
    public GetKnowledgeBaseResponseBodyVectorDBConfig getVectorDBConfig() {
        return this.vectorDBConfig;
    }

    public GetKnowledgeBaseResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public GetKnowledgeBaseResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
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
         * 
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs self = new GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs setGPU(Integer GPU) {
            this.GPU = GPU;
            return this;
        }
        public Integer getGPU() {
            return this.GPU;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs setSharedMemory(Integer sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetKnowledgeBaseResponseBodyAutoUpdateConfigEmbeddingConfig extends TeaModel {
        /**
         * <p>Embedding分批大小</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("BatchSize")
        public Integer batchSize;

        /**
         * <p>Embedding并发数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        public static GetKnowledgeBaseResponseBodyAutoUpdateConfigEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyAutoUpdateConfigEmbeddingConfig self = new GetKnowledgeBaseResponseBodyAutoUpdateConfigEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEmbeddingConfig setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEmbeddingConfig setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

    }

    public static class GetKnowledgeBaseResponseBodyAutoUpdateConfig extends TeaModel {
        /**
         * <p>运行资源配置</p>
         */
        @NameInMap("EcsSpecs")
        public java.util.List<GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs> ecsSpecs;

        /**
         * <p>Embedding配置</p>
         */
        @NameInMap("EmbeddingConfig")
        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEmbeddingConfig embeddingConfig;

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
         * 
         * <strong>example:</strong>
         * <p>public-cluster</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>知识库自动更新状态</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>用户VPC配置</p>
         */
        @NameInMap("UserVpc")
        public UserVpc userVpc;

        public static GetKnowledgeBaseResponseBodyAutoUpdateConfig build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyAutoUpdateConfig self = new GetKnowledgeBaseResponseBodyAutoUpdateConfig();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfig setEcsSpecs(java.util.List<GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs> ecsSpecs) {
            this.ecsSpecs = ecsSpecs;
            return this;
        }
        public java.util.List<GetKnowledgeBaseResponseBodyAutoUpdateConfigEcsSpecs> getEcsSpecs() {
            return this.ecsSpecs;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfig setEmbeddingConfig(GetKnowledgeBaseResponseBodyAutoUpdateConfigEmbeddingConfig embeddingConfig) {
            this.embeddingConfig = embeddingConfig;
            return this;
        }
        public GetKnowledgeBaseResponseBodyAutoUpdateConfigEmbeddingConfig getEmbeddingConfig() {
            return this.embeddingConfig;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfig setMaxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }
        public Integer getMaxRunningTimeInSeconds() {
            return this.maxRunningTimeInSeconds;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfig setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetKnowledgeBaseResponseBodyAutoUpdateConfig setUserVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }
        public UserVpc getUserVpc() {
            return this.userVpc;
        }

    }

    public static class GetKnowledgeBaseResponseBodyChunkConfig extends TeaModel {
        /**
         * <p>分块时长</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ChunkDuration")
        public Integer chunkDuration;

        /**
         * <p>分块重叠大小</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ChunkOverlap")
        public Integer chunkOverlap;

        /**
         * <p>分块大小</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ChunkSize")
        public Integer chunkSize;

        /**
         * <p>分块策略</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("ChunkStrategy")
        public String chunkStrategy;

        public static GetKnowledgeBaseResponseBodyChunkConfig build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyChunkConfig self = new GetKnowledgeBaseResponseBodyChunkConfig();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyChunkConfig setChunkDuration(Integer chunkDuration) {
            this.chunkDuration = chunkDuration;
            return this;
        }
        public Integer getChunkDuration() {
            return this.chunkDuration;
        }

        public GetKnowledgeBaseResponseBodyChunkConfig setChunkOverlap(Integer chunkOverlap) {
            this.chunkOverlap = chunkOverlap;
            return this;
        }
        public Integer getChunkOverlap() {
            return this.chunkOverlap;
        }

        public GetKnowledgeBaseResponseBodyChunkConfig setChunkSize(Integer chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }
        public Integer getChunkSize() {
            return this.chunkSize;
        }

        public GetKnowledgeBaseResponseBodyChunkConfig setChunkStrategy(String chunkStrategy) {
            this.chunkStrategy = chunkStrategy;
            return this;
        }
        public String getChunkStrategy() {
            return this.chunkStrategy;
        }

    }

    public static class GetKnowledgeBaseResponseBodyDataSources extends TeaModel {
        /**
         * <p>统一资源识别码</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/langstudio/source/</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static GetKnowledgeBaseResponseBodyDataSources build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyDataSources self = new GetKnowledgeBaseResponseBodyDataSources();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyDataSources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class GetKnowledgeBaseResponseBodyEmbeddingConfig extends TeaModel {
        /**
         * <p>Embedding连接ID</p>
         * 
         * <strong>example:</strong>
         * <p>conn-r3o7******38bh</p>
         */
        @NameInMap("ConnectionId")
        public String connectionId;

        /**
         * <p>Embedding连接名称</p>
         * 
         * <strong>example:</strong>
         * <p>myEmbeddingConn</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>模型</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v4</p>
         */
        @NameInMap("Model")
        public String model;

        public static GetKnowledgeBaseResponseBodyEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyEmbeddingConfig self = new GetKnowledgeBaseResponseBodyEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyEmbeddingConfig setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public GetKnowledgeBaseResponseBodyEmbeddingConfig setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public GetKnowledgeBaseResponseBodyEmbeddingConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

    }

    public static class GetKnowledgeBaseResponseBodyIndexColumnConfigColumnDefinitions extends TeaModel {
        /**
         * <p>列Key</p>
         */
        @NameInMap("Key")
        public String key;

        public static GetKnowledgeBaseResponseBodyIndexColumnConfigColumnDefinitions build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyIndexColumnConfigColumnDefinitions self = new GetKnowledgeBaseResponseBodyIndexColumnConfigColumnDefinitions();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyIndexColumnConfigColumnDefinitions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class GetKnowledgeBaseResponseBodyIndexColumnConfigContentColumns extends TeaModel {
        /**
         * <p>列Key</p>
         */
        @NameInMap("Key")
        public String key;

        public static GetKnowledgeBaseResponseBodyIndexColumnConfigContentColumns build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyIndexColumnConfigContentColumns self = new GetKnowledgeBaseResponseBodyIndexColumnConfigContentColumns();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyIndexColumnConfigContentColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class GetKnowledgeBaseResponseBodyIndexColumnConfigEmbeddingColumns extends TeaModel {
        /**
         * <p>列Key</p>
         */
        @NameInMap("Key")
        public String key;

        public static GetKnowledgeBaseResponseBodyIndexColumnConfigEmbeddingColumns build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyIndexColumnConfigEmbeddingColumns self = new GetKnowledgeBaseResponseBodyIndexColumnConfigEmbeddingColumns();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyIndexColumnConfigEmbeddingColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class GetKnowledgeBaseResponseBodyIndexColumnConfig extends TeaModel {
        /**
         * <p>所有列名</p>
         */
        @NameInMap("ColumnDefinitions")
        public java.util.List<GetKnowledgeBaseResponseBodyIndexColumnConfigColumnDefinitions> columnDefinitions;

        /**
         * <p>内容检索列</p>
         */
        @NameInMap("ContentColumns")
        public java.util.List<GetKnowledgeBaseResponseBodyIndexColumnConfigContentColumns> contentColumns;

        /**
         * <p>Embedding列</p>
         */
        @NameInMap("EmbeddingColumns")
        public java.util.List<GetKnowledgeBaseResponseBodyIndexColumnConfigEmbeddingColumns> embeddingColumns;

        public static GetKnowledgeBaseResponseBodyIndexColumnConfig build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyIndexColumnConfig self = new GetKnowledgeBaseResponseBodyIndexColumnConfig();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyIndexColumnConfig setColumnDefinitions(java.util.List<GetKnowledgeBaseResponseBodyIndexColumnConfigColumnDefinitions> columnDefinitions) {
            this.columnDefinitions = columnDefinitions;
            return this;
        }
        public java.util.List<GetKnowledgeBaseResponseBodyIndexColumnConfigColumnDefinitions> getColumnDefinitions() {
            return this.columnDefinitions;
        }

        public GetKnowledgeBaseResponseBodyIndexColumnConfig setContentColumns(java.util.List<GetKnowledgeBaseResponseBodyIndexColumnConfigContentColumns> contentColumns) {
            this.contentColumns = contentColumns;
            return this;
        }
        public java.util.List<GetKnowledgeBaseResponseBodyIndexColumnConfigContentColumns> getContentColumns() {
            return this.contentColumns;
        }

        public GetKnowledgeBaseResponseBodyIndexColumnConfig setEmbeddingColumns(java.util.List<GetKnowledgeBaseResponseBodyIndexColumnConfigEmbeddingColumns> embeddingColumns) {
            this.embeddingColumns = embeddingColumns;
            return this;
        }
        public java.util.List<GetKnowledgeBaseResponseBodyIndexColumnConfigEmbeddingColumns> getEmbeddingColumns() {
            return this.embeddingColumns;
        }

    }

    public static class GetKnowledgeBaseResponseBodyMetaDataConfigCustomMetaData extends TeaModel {
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

        public static GetKnowledgeBaseResponseBodyMetaDataConfigCustomMetaData build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyMetaDataConfigCustomMetaData self = new GetKnowledgeBaseResponseBodyMetaDataConfigCustomMetaData();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyMetaDataConfigCustomMetaData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetKnowledgeBaseResponseBodyMetaDataConfigCustomMetaData setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public GetKnowledgeBaseResponseBodyMetaDataConfigCustomMetaData setValueCount(Integer valueCount) {
            this.valueCount = valueCount;
            return this;
        }
        public Integer getValueCount() {
            return this.valueCount;
        }

        public GetKnowledgeBaseResponseBodyMetaDataConfigCustomMetaData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class GetKnowledgeBaseResponseBodyMetaDataConfig extends TeaModel {
        /**
         * <p>自定义元数据</p>
         */
        @NameInMap("CustomMetaData")
        public java.util.List<GetKnowledgeBaseResponseBodyMetaDataConfigCustomMetaData> customMetaData;

        public static GetKnowledgeBaseResponseBodyMetaDataConfig build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyMetaDataConfig self = new GetKnowledgeBaseResponseBodyMetaDataConfig();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyMetaDataConfig setCustomMetaData(java.util.List<GetKnowledgeBaseResponseBodyMetaDataConfigCustomMetaData> customMetaData) {
            this.customMetaData = customMetaData;
            return this;
        }
        public java.util.List<GetKnowledgeBaseResponseBodyMetaDataConfigCustomMetaData> getCustomMetaData() {
            return this.customMetaData;
        }

    }

    public static class GetKnowledgeBaseResponseBodyVectorDBConfig extends TeaModel {
        /**
         * <p>Collectioin名称</p>
         * 
         * <strong>example:</strong>
         * <p>my_collection</p>
         */
        @NameInMap("CollectionName")
        public String collectionName;

        /**
         * <p>Embedding连接ID</p>
         * 
         * <strong>example:</strong>
         * <p>conn-7y5y******jja7</p>
         */
        @NameInMap("ConnectionId")
        public String connectionId;

        /**
         * <p>VectorDB连接名称</p>
         * 
         * <strong>example:</strong>
         * <p>myVectorConn</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>VectorDB类型</p>
         * 
         * <strong>example:</strong>
         * <p>Milvus</p>
         */
        @NameInMap("VectorDBType")
        public String vectorDBType;

        public static GetKnowledgeBaseResponseBodyVectorDBConfig build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyVectorDBConfig self = new GetKnowledgeBaseResponseBodyVectorDBConfig();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyVectorDBConfig setCollectionName(String collectionName) {
            this.collectionName = collectionName;
            return this;
        }
        public String getCollectionName() {
            return this.collectionName;
        }

        public GetKnowledgeBaseResponseBodyVectorDBConfig setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public GetKnowledgeBaseResponseBodyVectorDBConfig setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public GetKnowledgeBaseResponseBodyVectorDBConfig setVectorDBType(String vectorDBType) {
            this.vectorDBType = vectorDBType;
            return this;
        }
        public String getVectorDBType() {
            return this.vectorDBType;
        }

    }

}
