// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeSpaceShrinkRequest extends TeaModel {
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
    public String shardingStrategyConfigShrink;

    public static UpdateKnowledgeSpaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeSpaceShrinkRequest self = new UpdateKnowledgeSpaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeSpaceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeSpaceShrinkRequest setKnowledgeSpaceId(String knowledgeSpaceId) {
        this.knowledgeSpaceId = knowledgeSpaceId;
        return this;
    }
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
    }

    public UpdateKnowledgeSpaceShrinkRequest setLLMModel(String LLMModel) {
        this.LLMModel = LLMModel;
        return this;
    }
    public String getLLMModel() {
        return this.LLMModel;
    }

    public UpdateKnowledgeSpaceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKnowledgeSpaceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateKnowledgeSpaceShrinkRequest setRerankModel(String rerankModel) {
        this.rerankModel = rerankModel;
        return this;
    }
    public String getRerankModel() {
        return this.rerankModel;
    }

    public UpdateKnowledgeSpaceShrinkRequest setShardingStrategyConfigShrink(String shardingStrategyConfigShrink) {
        this.shardingStrategyConfigShrink = shardingStrategyConfigShrink;
        return this;
    }
    public String getShardingStrategyConfigShrink() {
        return this.shardingStrategyConfigShrink;
    }

}
