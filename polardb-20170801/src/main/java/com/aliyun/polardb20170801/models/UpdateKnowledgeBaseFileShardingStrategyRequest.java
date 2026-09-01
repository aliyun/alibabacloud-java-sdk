// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseFileShardingStrategyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e347ddb8-49bb-5c66-94bc-fa05cedaeac8</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InheritSpaceStrategy")
    public Boolean inheritSpaceStrategy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-2zesv6l6a63xsrym</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShardingStrategyConfig")
    public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfig shardingStrategyConfig;

    public static UpdateKnowledgeBaseFileShardingStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseFileShardingStrategyRequest self = new UpdateKnowledgeBaseFileShardingStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseFileShardingStrategyRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UpdateKnowledgeBaseFileShardingStrategyRequest setInheritSpaceStrategy(Boolean inheritSpaceStrategy) {
        this.inheritSpaceStrategy = inheritSpaceStrategy;
        return this;
    }
    public Boolean getInheritSpaceStrategy() {
        return this.inheritSpaceStrategy;
    }

    public UpdateKnowledgeBaseFileShardingStrategyRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public UpdateKnowledgeBaseFileShardingStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateKnowledgeBaseFileShardingStrategyRequest setShardingStrategyConfig(UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfig shardingStrategyConfig) {
        this.shardingStrategyConfig = shardingStrategyConfig;
        return this;
    }
    public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfig getShardingStrategyConfig() {
        return this.shardingStrategyConfig;
    }

    public static class UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategyParameters extends TeaModel {
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

        public static UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategyParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategyParameters self = new UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategyParameters();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategyParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategyParameters setMergePeers(Boolean mergePeers) {
            this.mergePeers = mergePeers;
            return this;
        }
        public Boolean getMergePeers() {
            return this.mergePeers;
        }

    }

    public static class UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategy extends TeaModel {
        @NameInMap("Parameters")
        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategyParameters parameters;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hybrid</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategy build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategy self = new UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategy();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategy setParameters(UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategyParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategyParameters getParameters() {
            return this.parameters;
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesMatch extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        public static UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesMatch build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesMatch self = new UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesMatch();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesMatch setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategyParameters extends TeaModel {
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

        public static UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategyParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategyParameters self = new UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategyParameters();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategyParameters setMarkdownTables(String markdownTables) {
            this.markdownTables = markdownTables;
            return this;
        }
        public String getMarkdownTables() {
            return this.markdownTables;
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategyParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

    }

    public static class UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategy extends TeaModel {
        @NameInMap("Parameters")
        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategyParameters parameters;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hierarchical</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategy build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategy self = new UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategy();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategy setParameters(UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategyParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategyParameters getParameters() {
            return this.parameters;
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRules extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Match")
        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesMatch match;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Strategy")
        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategy strategy;

        public static UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRules self = new UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRules();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRules setMatch(UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesMatch match) {
            this.match = match;
            return this;
        }
        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesMatch getMatch() {
            return this.match;
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRules setStrategy(UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRulesStrategy getStrategy() {
            return this.strategy;
        }

    }

    public static class UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DefaultStrategy")
        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategy defaultStrategy;

        @NameInMap("Rules")
        public java.util.List<UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRules> rules;

        public static UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfig self = new UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfig setDefaultStrategy(UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategy defaultStrategy) {
            this.defaultStrategy = defaultStrategy;
            return this;
        }
        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigDefaultStrategy getDefaultStrategy() {
            return this.defaultStrategy;
        }

        public UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfig setRules(java.util.List<UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<UpdateKnowledgeBaseFileShardingStrategyRequestShardingStrategyConfigRules> getRules() {
            return this.rules;
        }

    }

}
