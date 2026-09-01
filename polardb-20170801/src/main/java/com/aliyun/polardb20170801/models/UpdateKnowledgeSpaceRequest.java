// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeSpaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>testDesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pks-xxxxxx</p>
     */
    @NameInMap("KnowledgeSpaceId")
    public String knowledgeSpaceId;

    /**
     * <strong>example:</strong>
     * <p>qwen3.6-plus</p>
     */
    @NameInMap("LLMModel")
    public String LLMModel;

    /**
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>qwen3-rerank</p>
     */
    @NameInMap("RerankModel")
    public String rerankModel;

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
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaxTokens")
        public Integer maxTokens;

        /**
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
        @NameInMap("Parameters")
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategyParameters parameters;

        /**
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
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("MarkdownTables")
        public String markdownTables;

        /**
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
        @NameInMap("Parameters")
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesStrategyParameters parameters;

        /**
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
        @NameInMap("Match")
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigRulesMatch match;

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
        @NameInMap("DefaultStrategy")
        public UpdateKnowledgeSpaceRequestShardingStrategyConfigDefaultStrategy defaultStrategy;

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
