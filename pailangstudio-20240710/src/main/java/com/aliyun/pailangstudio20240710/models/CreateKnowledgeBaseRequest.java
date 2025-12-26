// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChunkConfig")
    public CreateKnowledgeBaseRequestChunkConfig chunkConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSources")
    public java.util.List<CreateKnowledgeBaseRequestDataSources> dataSources;

    /**
     * <strong>example:</strong>
     * <p>This is a description of the knowledge base.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EmbeddingConfig")
    public CreateKnowledgeBaseRequestEmbeddingConfig embeddingConfig;

    @NameInMap("IndexColumnConfig")
    public CreateKnowledgeBaseRequestIndexColumnConfig indexColumnConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEXT</p>
     */
    @NameInMap("KnowledgeBaseType")
    public String knowledgeBaseType;

    @NameInMap("MetaDataConfig")
    public CreateKnowledgeBaseRequestMetaDataConfig metaDataConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/langstudio/output/</p>
     */
    @NameInMap("OutputDir")
    public String outputDir;

    /**
     * <strong>example:</strong>
     * <p>rtime-apje******beaz</p>
     */
    @NameInMap("RuntimeId")
    public String runtimeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VectorDBConfig")
    public CreateKnowledgeBaseRequestVectorDBConfig vectorDBConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>478**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseRequest self = new CreateKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateKnowledgeBaseRequest setChunkConfig(CreateKnowledgeBaseRequestChunkConfig chunkConfig) {
        this.chunkConfig = chunkConfig;
        return this;
    }
    public CreateKnowledgeBaseRequestChunkConfig getChunkConfig() {
        return this.chunkConfig;
    }

    public CreateKnowledgeBaseRequest setDataSources(java.util.List<CreateKnowledgeBaseRequestDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<CreateKnowledgeBaseRequestDataSources> getDataSources() {
        return this.dataSources;
    }

    public CreateKnowledgeBaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseRequest setEmbeddingConfig(CreateKnowledgeBaseRequestEmbeddingConfig embeddingConfig) {
        this.embeddingConfig = embeddingConfig;
        return this;
    }
    public CreateKnowledgeBaseRequestEmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    public CreateKnowledgeBaseRequest setIndexColumnConfig(CreateKnowledgeBaseRequestIndexColumnConfig indexColumnConfig) {
        this.indexColumnConfig = indexColumnConfig;
        return this;
    }
    public CreateKnowledgeBaseRequestIndexColumnConfig getIndexColumnConfig() {
        return this.indexColumnConfig;
    }

    public CreateKnowledgeBaseRequest setKnowledgeBaseType(String knowledgeBaseType) {
        this.knowledgeBaseType = knowledgeBaseType;
        return this;
    }
    public String getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    public CreateKnowledgeBaseRequest setMetaDataConfig(CreateKnowledgeBaseRequestMetaDataConfig metaDataConfig) {
        this.metaDataConfig = metaDataConfig;
        return this;
    }
    public CreateKnowledgeBaseRequestMetaDataConfig getMetaDataConfig() {
        return this.metaDataConfig;
    }

    public CreateKnowledgeBaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeBaseRequest setOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }
    public String getOutputDir() {
        return this.outputDir;
    }

    public CreateKnowledgeBaseRequest setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public String getRuntimeId() {
        return this.runtimeId;
    }

    public CreateKnowledgeBaseRequest setVectorDBConfig(CreateKnowledgeBaseRequestVectorDBConfig vectorDBConfig) {
        this.vectorDBConfig = vectorDBConfig;
        return this;
    }
    public CreateKnowledgeBaseRequestVectorDBConfig getVectorDBConfig() {
        return this.vectorDBConfig;
    }

    public CreateKnowledgeBaseRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateKnowledgeBaseRequestChunkConfig extends TeaModel {
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

        public static CreateKnowledgeBaseRequestChunkConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestChunkConfig self = new CreateKnowledgeBaseRequestChunkConfig();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestChunkConfig setChunkDuration(Integer chunkDuration) {
            this.chunkDuration = chunkDuration;
            return this;
        }
        public Integer getChunkDuration() {
            return this.chunkDuration;
        }

        public CreateKnowledgeBaseRequestChunkConfig setChunkOverlap(Integer chunkOverlap) {
            this.chunkOverlap = chunkOverlap;
            return this;
        }
        public Integer getChunkOverlap() {
            return this.chunkOverlap;
        }

        public CreateKnowledgeBaseRequestChunkConfig setChunkSize(Integer chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }
        public Integer getChunkSize() {
            return this.chunkSize;
        }

        public CreateKnowledgeBaseRequestChunkConfig setChunkStrategy(String chunkStrategy) {
            this.chunkStrategy = chunkStrategy;
            return this;
        }
        public String getChunkStrategy() {
            return this.chunkStrategy;
        }

    }

    public static class CreateKnowledgeBaseRequestDataSources extends TeaModel {
        /**
         * <p>统一资源识别码</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/langstudio/source/</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static CreateKnowledgeBaseRequestDataSources build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestDataSources self = new CreateKnowledgeBaseRequestDataSources();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestDataSources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class CreateKnowledgeBaseRequestEmbeddingConfig extends TeaModel {
        /**
         * <p>Embedding连接ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>conn-r3o7******38bh</p>
         */
        @NameInMap("ConnectionId")
        public String connectionId;

        /**
         * <p>模型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v4</p>
         */
        @NameInMap("Model")
        public String model;

        public static CreateKnowledgeBaseRequestEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestEmbeddingConfig self = new CreateKnowledgeBaseRequestEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestEmbeddingConfig setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public CreateKnowledgeBaseRequestEmbeddingConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

    }

    public static class CreateKnowledgeBaseRequestIndexColumnConfigColumnDefinitions extends TeaModel {
        /**
         * <p>列Key</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Key")
        public String key;

        public static CreateKnowledgeBaseRequestIndexColumnConfigColumnDefinitions build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestIndexColumnConfigColumnDefinitions self = new CreateKnowledgeBaseRequestIndexColumnConfigColumnDefinitions();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestIndexColumnConfigColumnDefinitions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class CreateKnowledgeBaseRequestIndexColumnConfigContentColumns extends TeaModel {
        /**
         * <p>列Key</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Key")
        public String key;

        public static CreateKnowledgeBaseRequestIndexColumnConfigContentColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestIndexColumnConfigContentColumns self = new CreateKnowledgeBaseRequestIndexColumnConfigContentColumns();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestIndexColumnConfigContentColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class CreateKnowledgeBaseRequestIndexColumnConfigEmbeddingColumns extends TeaModel {
        /**
         * <p>列Key</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Key")
        public String key;

        public static CreateKnowledgeBaseRequestIndexColumnConfigEmbeddingColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestIndexColumnConfigEmbeddingColumns self = new CreateKnowledgeBaseRequestIndexColumnConfigEmbeddingColumns();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestIndexColumnConfigEmbeddingColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class CreateKnowledgeBaseRequestIndexColumnConfig extends TeaModel {
        /**
         * <p>所有列名</p>
         */
        @NameInMap("ColumnDefinitions")
        public java.util.List<CreateKnowledgeBaseRequestIndexColumnConfigColumnDefinitions> columnDefinitions;

        /**
         * <p>内容检索列</p>
         */
        @NameInMap("ContentColumns")
        public java.util.List<CreateKnowledgeBaseRequestIndexColumnConfigContentColumns> contentColumns;

        /**
         * <p>Embedding列</p>
         */
        @NameInMap("EmbeddingColumns")
        public java.util.List<CreateKnowledgeBaseRequestIndexColumnConfigEmbeddingColumns> embeddingColumns;

        public static CreateKnowledgeBaseRequestIndexColumnConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestIndexColumnConfig self = new CreateKnowledgeBaseRequestIndexColumnConfig();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestIndexColumnConfig setColumnDefinitions(java.util.List<CreateKnowledgeBaseRequestIndexColumnConfigColumnDefinitions> columnDefinitions) {
            this.columnDefinitions = columnDefinitions;
            return this;
        }
        public java.util.List<CreateKnowledgeBaseRequestIndexColumnConfigColumnDefinitions> getColumnDefinitions() {
            return this.columnDefinitions;
        }

        public CreateKnowledgeBaseRequestIndexColumnConfig setContentColumns(java.util.List<CreateKnowledgeBaseRequestIndexColumnConfigContentColumns> contentColumns) {
            this.contentColumns = contentColumns;
            return this;
        }
        public java.util.List<CreateKnowledgeBaseRequestIndexColumnConfigContentColumns> getContentColumns() {
            return this.contentColumns;
        }

        public CreateKnowledgeBaseRequestIndexColumnConfig setEmbeddingColumns(java.util.List<CreateKnowledgeBaseRequestIndexColumnConfigEmbeddingColumns> embeddingColumns) {
            this.embeddingColumns = embeddingColumns;
            return this;
        }
        public java.util.List<CreateKnowledgeBaseRequestIndexColumnConfigEmbeddingColumns> getEmbeddingColumns() {
            return this.embeddingColumns;
        }

    }

    public static class CreateKnowledgeBaseRequestMetaDataConfigCustomMetaData extends TeaModel {
        /**
         * <p>元数据Key</p>
         * 
         * <strong>example:</strong>
         * <p>author</p>
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

        public static CreateKnowledgeBaseRequestMetaDataConfigCustomMetaData build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestMetaDataConfigCustomMetaData self = new CreateKnowledgeBaseRequestMetaDataConfigCustomMetaData();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestMetaDataConfigCustomMetaData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateKnowledgeBaseRequestMetaDataConfigCustomMetaData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class CreateKnowledgeBaseRequestMetaDataConfig extends TeaModel {
        /**
         * <p>自定义元数据</p>
         */
        @NameInMap("CustomMetaData")
        public java.util.List<CreateKnowledgeBaseRequestMetaDataConfigCustomMetaData> customMetaData;

        public static CreateKnowledgeBaseRequestMetaDataConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestMetaDataConfig self = new CreateKnowledgeBaseRequestMetaDataConfig();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestMetaDataConfig setCustomMetaData(java.util.List<CreateKnowledgeBaseRequestMetaDataConfigCustomMetaData> customMetaData) {
            this.customMetaData = customMetaData;
            return this;
        }
        public java.util.List<CreateKnowledgeBaseRequestMetaDataConfigCustomMetaData> getCustomMetaData() {
            return this.customMetaData;
        }

    }

    public static class CreateKnowledgeBaseRequestVectorDBConfig extends TeaModel {
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
         * <p>VectorDB类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Milvus</p>
         */
        @NameInMap("VectorDBType")
        public String vectorDBType;

        public static CreateKnowledgeBaseRequestVectorDBConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestVectorDBConfig self = new CreateKnowledgeBaseRequestVectorDBConfig();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestVectorDBConfig setCollectionName(String collectionName) {
            this.collectionName = collectionName;
            return this;
        }
        public String getCollectionName() {
            return this.collectionName;
        }

        public CreateKnowledgeBaseRequestVectorDBConfig setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public CreateKnowledgeBaseRequestVectorDBConfig setVectorDBType(String vectorDBType) {
            this.vectorDBType = vectorDBType;
            return this;
        }
        public String getVectorDBType() {
            return this.vectorDBType;
        }

    }

}
