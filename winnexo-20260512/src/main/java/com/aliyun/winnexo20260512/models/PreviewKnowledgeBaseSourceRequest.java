// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PreviewKnowledgeBaseSourceRequest extends TeaModel {
    /**
     * <p>知识 ID（数据源唯一标识）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static PreviewKnowledgeBaseSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewKnowledgeBaseSourceRequest self = new PreviewKnowledgeBaseSourceRequest();
        return TeaModel.build(map, self);
    }

    public PreviewKnowledgeBaseSourceRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public PreviewKnowledgeBaseSourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
