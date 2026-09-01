// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeSpaceAttributeResponseBody extends TeaModel {
    /**
     * <p>The access control list (ACL) mode of the knowledge space. Valid values:</p>
     * <ul>
     * <li>DISABLED</li>
     * <li>ENFORCED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENFORCED</p>
     */
    @NameInMap("ACLMode")
    public String ACLMode;

    /**
     * <p>The time when the knowledge space was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-25T09:53:44Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The ID of the PolarDB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>polar_rag_meta</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The type of the database engine. Valid values:</p>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The description of the knowledge space.</p>
     * 
     * <strong>example:</strong>
     * <p>testDesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The vector dimensions.</p>
     * 
     * <strong>example:</strong>
     * <p>1536</p>
     */
    @NameInMap("EmbeddingDimension")
    public Integer embeddingDimension;

    /**
     * <p>The embedding model.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v4</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    /**
     * <p>The total number of knowledge bases.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("KnowledgeBaseCount")
    public Integer knowledgeBaseCount;

    /**
     * <p>The unique identifier of the knowledge space.</p>
     * 
     * <strong>example:</strong>
     * <p>pks-xxxxxx</p>
     */
    @NameInMap("KnowledgeSpaceId")
    public String knowledgeSpaceId;

    /**
     * <p>The large language model.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3.6-plus</p>
     */
    @NameInMap("LLMModel")
    public String LLMModel;

    /**
     * <p>The name of the knowledge space.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>OSS Bucket</p>
     * 
     * <strong>example:</strong>
     * <p>test-bucket</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The reranking model.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-rerank</p>
     */
    @NameInMap("RerankModel")
    public String rerankModel;

    /**
     * <p>The chunk size in tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("ShardSize")
    public Integer shardSize;

    /**
     * <p>The default chunking strategy configuration of the knowledge space. This parameter may be empty if existing instances do not have the complete configuration saved.</p>
     */
    @NameInMap("ShardingStrategyConfig")
    public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfig shardingStrategyConfig;

    /**
     * <p>The instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>Activation</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The chunking strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>hybrid</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    /**
     * <p>The total number of documents.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalDocs")
    public Integer totalDocs;

    /**
     * <p>The total size in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>318881</p>
     */
    @NameInMap("TotalSizeBytes")
    public Long totalSizeBytes;

    public static DescribeKnowledgeSpaceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeSpaceAttributeResponseBody self = new DescribeKnowledgeSpaceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setACLMode(String ACLMode) {
        this.ACLMode = ACLMode;
        return this;
    }
    public String getACLMode() {
        return this.ACLMode;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setEmbeddingDimension(Integer embeddingDimension) {
        this.embeddingDimension = embeddingDimension;
        return this;
    }
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setEmbeddingModel(String embeddingModel) {
        this.embeddingModel = embeddingModel;
        return this;
    }
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setKnowledgeBaseCount(Integer knowledgeBaseCount) {
        this.knowledgeBaseCount = knowledgeBaseCount;
        return this;
    }
    public Integer getKnowledgeBaseCount() {
        return this.knowledgeBaseCount;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setKnowledgeSpaceId(String knowledgeSpaceId) {
        this.knowledgeSpaceId = knowledgeSpaceId;
        return this;
    }
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setLLMModel(String LLMModel) {
        this.LLMModel = LLMModel;
        return this;
    }
    public String getLLMModel() {
        return this.LLMModel;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setRerankModel(String rerankModel) {
        this.rerankModel = rerankModel;
        return this;
    }
    public String getRerankModel() {
        return this.rerankModel;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setShardSize(Integer shardSize) {
        this.shardSize = shardSize;
        return this;
    }
    public Integer getShardSize() {
        return this.shardSize;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setShardingStrategyConfig(DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfig shardingStrategyConfig) {
        this.shardingStrategyConfig = shardingStrategyConfig;
        return this;
    }
    public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfig getShardingStrategyConfig() {
        return this.shardingStrategyConfig;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setTotalDocs(Integer totalDocs) {
        this.totalDocs = totalDocs;
        return this;
    }
    public Integer getTotalDocs() {
        return this.totalDocs;
    }

    public DescribeKnowledgeSpaceAttributeResponseBody setTotalSizeBytes(Long totalSizeBytes) {
        this.totalSizeBytes = totalSizeBytes;
        return this;
    }
    public Long getTotalSizeBytes() {
        return this.totalSizeBytes;
    }

    public static class DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategyParameters extends TeaModel {
        /**
         * <p>The maximum number of tokens in a single chunk.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaxTokens")
        public Integer maxTokens;

        /**
         * <p>Specifies whether to merge adjacent small chunks under the same heading.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MergePeers")
        public Boolean mergePeers;

        public static DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategyParameters self = new DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategyParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategyParameters setMergePeers(Boolean mergePeers) {
            this.mergePeers = mergePeers;
            return this;
        }
        public Boolean getMergePeers() {
            return this.mergePeers;
        }

    }

    public static class DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategy extends TeaModel {
        /**
         * <p>The parameter details.</p>
         */
        @NameInMap("Parameters")
        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategyParameters parameters;

        /**
         * <p>The type of the default chunking strategy. Valid values: hybrid or hierarchical.</p>
         * 
         * <strong>example:</strong>
         * <p>hybrid</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategy self = new DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategy setParameters(DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategyParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategyParameters getParameters() {
            return this.parameters;
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesMatch extends TeaModel {
        /**
         * <p>The content type. Currently, table is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        public static DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesMatch build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesMatch self = new DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesMatch();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesMatch setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategyParameters extends TeaModel {
        /**
         * <p>The Markdown table processing mode. Valid values: auto, on, or off.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("MarkdownTables")
        public String markdownTables;

        /**
         * <p>The maximum number of tokens in a single chunk for matched content.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaxTokens")
        public Integer maxTokens;

        public static DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategyParameters self = new DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategyParameters setMarkdownTables(String markdownTables) {
            this.markdownTables = markdownTables;
            return this;
        }
        public String getMarkdownTables() {
            return this.markdownTables;
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategyParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

    }

    public static class DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategy extends TeaModel {
        /**
         * <p>The parameter details.</p>
         */
        @NameInMap("Parameters")
        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategyParameters parameters;

        /**
         * <p>The chunking strategy type used when a rule is matched.</p>
         * 
         * <strong>example:</strong>
         * <p>hierarchical</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategy self = new DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategy setParameters(DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategyParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategyParameters getParameters() {
            return this.parameters;
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRules extends TeaModel {
        /**
         * <p>The content type. Currently, table is supported.</p>
         */
        @NameInMap("Match")
        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesMatch match;

        /**
         * <p>The chunking strategy.</p>
         */
        @NameInMap("Strategy")
        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategy strategy;

        public static DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRules self = new DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRules();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRules setMatch(DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesMatch match) {
            this.match = match;
            return this;
        }
        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesMatch getMatch() {
            return this.match;
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRules setStrategy(DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRulesStrategy getStrategy() {
            return this.strategy;
        }

    }

    public static class DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfig extends TeaModel {
        /**
         * <p>The default chunking strategy. This strategy is used when no rule is matched.</p>
         */
        @NameInMap("DefaultStrategy")
        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategy defaultStrategy;

        /**
         * <p>The list of override rules that are matched in order.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRules> rules;

        public static DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfig self = new DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfig setDefaultStrategy(DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategy defaultStrategy) {
            this.defaultStrategy = defaultStrategy;
            return this;
        }
        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigDefaultStrategy getDefaultStrategy() {
            return this.defaultStrategy;
        }

        public DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfig setRules(java.util.List<DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeKnowledgeSpaceAttributeResponseBodyShardingStrategyConfigRules> getRules() {
            return this.rules;
        }

    }

}
