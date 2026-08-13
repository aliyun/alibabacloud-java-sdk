// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseSourceRequest extends TeaModel {
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
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>676577544219585</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetKnowledgeBaseSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseSourceRequest self = new GetKnowledgeBaseSourceRequest();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseSourceRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public GetKnowledgeBaseSourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
