// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseSourceTagsRequest extends TeaModel {
    /**
     * <p>数据源 ID（租户内唯一）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>资源标签（JSON 字符串列表，如 [&quot;tagA&quot;,&quot;tagB&quot;]；传 null 表示清空标签）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateKnowledgeBaseSourceTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseSourceTagsRequest self = new UpdateKnowledgeBaseSourceTagsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseSourceTagsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public UpdateKnowledgeBaseSourceTagsRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public UpdateKnowledgeBaseSourceTagsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
