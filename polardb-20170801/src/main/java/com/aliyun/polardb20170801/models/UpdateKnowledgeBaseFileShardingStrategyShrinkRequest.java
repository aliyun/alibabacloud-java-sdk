// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseFileShardingStrategyShrinkRequest extends TeaModel {
    /**
     * <p>The unique ID of the knowledge base file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e347ddb8-49bb-5c66-94bc-fa05cedaeac8</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>Specifies whether to restore inheritance of the chunking strategy from the knowledge space. When this parameter is set to true, ShardingStrategyConfig cannot be specified at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InheritSpaceStrategy")
    public Boolean inheritSpaceStrategy;

    /**
     * <p>The unique ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-2zesv6l6a63xsrym</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The ID of the region where the knowledge base resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The file-level chunking strategy configuration. This parameter is required when InheritSpaceStrategy is not set to true.</p>
     */
    @NameInMap("ShardingStrategyConfig")
    public String shardingStrategyConfigShrink;

    public static UpdateKnowledgeBaseFileShardingStrategyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseFileShardingStrategyShrinkRequest self = new UpdateKnowledgeBaseFileShardingStrategyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseFileShardingStrategyShrinkRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UpdateKnowledgeBaseFileShardingStrategyShrinkRequest setInheritSpaceStrategy(Boolean inheritSpaceStrategy) {
        this.inheritSpaceStrategy = inheritSpaceStrategy;
        return this;
    }
    public Boolean getInheritSpaceStrategy() {
        return this.inheritSpaceStrategy;
    }

    public UpdateKnowledgeBaseFileShardingStrategyShrinkRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public UpdateKnowledgeBaseFileShardingStrategyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateKnowledgeBaseFileShardingStrategyShrinkRequest setShardingStrategyConfigShrink(String shardingStrategyConfigShrink) {
        this.shardingStrategyConfigShrink = shardingStrategyConfigShrink;
        return this;
    }
    public String getShardingStrategyConfigShrink() {
        return this.shardingStrategyConfigShrink;
    }

}
