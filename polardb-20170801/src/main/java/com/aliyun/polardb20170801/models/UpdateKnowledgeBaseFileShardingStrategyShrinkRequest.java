// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseFileShardingStrategyShrinkRequest extends TeaModel {
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
