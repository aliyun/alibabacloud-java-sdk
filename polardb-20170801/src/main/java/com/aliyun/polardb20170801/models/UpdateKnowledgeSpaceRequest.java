// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeSpaceRequest extends TeaModel {
    /**
     * <p>The description of the knowledge space. The description can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testDesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The unique identifier of the knowledge space.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pks-xxxxxx</p>
     */
    @NameInMap("KnowledgeSpaceId")
    public String knowledgeSpaceId;

    /**
     * <p>The name of the large language model.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3.6-plus</p>
     */
    @NameInMap("LLMModel")
    public String LLMModel;

    /**
     * <p>The name of the knowledge space. The name must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the reranking model.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-rerank</p>
     */
    @NameInMap("RerankModel")
    public String rerankModel;

    /**
     * <p>The default chunking strategy configuration for the knowledge space. Both simple strategies and composite strategies that match by content type are supported.</p>
     */
    @NameInMap("ShardingStrategyConfig")
    public UpdateKnowledgeSpaceRequestShardingStrategyConfig shardingStrategyConfig;

    public static UpdateKnowledgeSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeSpaceRequest self = new UpdateKnowledgeSpaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeSpaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeSpaceRequest setKnowledgeSpaceId(String knowledgeSpaceId) {
        this.knowledgeSpaceId = knowledgeSpaceId;
        return this;
    }
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
    }

    public UpdateKnowledgeSpaceRequest setLLMModel(String LLMModel) {
        this.LLMModel = LLMModel;
        return this;
    }
    public String getLLMModel() {
        return this.LLMModel;
    }

    public UpdateKnowledgeSpaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKnowledgeSpaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateKnowledgeSpaceRequest setRerankModel(String rerankModel) {
        this.rerankModel = rerankModel;
        return this;
    }
    public String getRerankModel() {
        return this.rerankModel;
    }

    public UpdateKnowledgeSpaceRequest setShardingStrategyConfig(UpdateKnowledgeSpaceRequestShardingStrategyConfig shardingStrategyConfig) {
        this.shardingStrategyConfig = shardingStrategyConfig;
        return this;
    }
    public UpdateKnowledgeSpaceRequestShardingStrategyConfig getShardingStrategyConfig() {
        return this.shardingStrategyConfig;
    }

    public static class UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategyParameters extends TeaModel {
        /**
         * <p>The maximum number of tokens per chunk. The value must be a positive integer.</p>
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

        public static UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategyParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategyParameters self = new UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategyParameters();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategyParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategyParameters setMergePeers(Boolean mergePeers) {
            this.mergePeers = mergePeers;
            return this;
        }
        public Boolean getMergePeers() {
            return this.mergePeers;
        }

    }

    public static class UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategy extends TeaModel {
        /**
         * <p>The parameters of the default chunking strategy. MaxTokens and MergePeers take effect only when Type is set to hybrid.</p>
         */
        @NameInMap("Parameters")
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategyParameters parameters;

        /**
         * <p>The type of the default chunking strategy. Valid values: hybrid or hierarchical.</p>
         * 
         * <strong>example:</strong>
         * <p>hybrid</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategy build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategy self = new UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategy();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategy setParameters(UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategyParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategyParameters getParameters() {
            return this.parameters;
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesMatch extends TeaModel {
        /**
         * <p>The content type. Currently, only table is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        public static UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesMatch build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesMatch self = new UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesMatch();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesMatch setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategyParameters extends TeaModel {
        /**
         * <p>The processing mode for Markdown tables. Valid values: auto, on, or off.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("MarkdownTables")
        public String markdownTables;

        /**
         * <p>The maximum number of tokens per chunk for matched content. The value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaxTokens")
        public Integer maxTokens;

        public static UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategyParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategyParameters self = new UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategyParameters();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategyParameters setMarkdownTables(String markdownTables) {
            this.markdownTables = markdownTables;
            return this;
        }
        public String getMarkdownTables() {
            return this.markdownTables;
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategyParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

    }

    public static class UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategy extends TeaModel {
        /**
         * <p>The chunking strategy parameters for the override rule. MaxTokens takes effect only when Type is set to hybrid. MarkdownTables supports auto, on, or off.</p>
         */
        @NameInMap("Parameters")
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategyParameters parameters;

        /**
         * <p>The type of the chunking strategy to use when the rule is matched. Valid values: hybrid or hierarchical.</p>
         * 
         * <strong>example:</strong>
         * <p>hierarchical</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategy build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategy self = new UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategy();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategy setParameters(UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategyParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategyParameters getParameters() {
            return this.parameters;
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateKnowledgeSpaceRequestShardingStrategyConfigRules extends TeaModel {
        /**
         * <p>The match condition of the rule. Currently, only exact matching of table content by content type is supported.</p>
         */
        @NameInMap("Match")
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesMatch match;

        /**
         * <p>The chunking strategy to use when the rule is matched.</p>
         */
        @NameInMap("Strategy")
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategy strategy;

        public static UpdateKnowledgeSpaceRequestShardingStrategyConfigRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSpaceRequestShardingStrategyConfigRules self = new UpdateKnowledgeSpaceRequestShardingStrategyConfigRules();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRules setMatch(UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesMatch match) {
            this.match = match;
            return this;
        }
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesMatch getMatch() {
            return this.match;
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRules setStrategy(UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategy getStrategy() {
            return this.strategy;
        }

    }

    public static class UpdateKnowledgeSpaceRequestShardingStrategyConfig extends TeaModel {
        /**
         * <p>The default chunking strategy. This strategy is used when no rule is matched.</p>
         */
        @NameInMap("DefaultStrategy")
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategy defaultStrategy;

        /**
         * <p>The list of override rules that are matched in order. Currently, a maximum of one exact-match rule with ContentType set to table is supported.</p>
         */
        @NameInMap("Rules")
        public java.util.List<UpdateKnowledgeSpaceRequestShardingStrategyConfigRules> rules;

        public static UpdateKnowledgeSpaceRequestShardingStrategyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeSpaceRequestShardingStrategyConfig self = new UpdateKnowledgeSpaceRequestShardingStrategyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfig setDefaultStrategy(UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategy defaultStrategy) {
            this.defaultStrategy = defaultStrategy;
            return this;
        }
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategy getDefaultStrategy() {
            return this.defaultStrategy;
        }

        public UpdateKnowledgeSpaceRequestShardingStrategyConfig setRules(java.util.List<UpdateKnowledgeSpaceRequestShardingStrategyConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<UpdateKnowledgeSpaceRequestShardingStrategyConfigRules> getRules() {
            return this.rules;
        }

    }

}
