// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PreviewKnowledgeBaseSourceRequest extends TeaModel {
    /**
     * <p>The data source ID, which is unique within the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass it explicitly with --tenant-id.</p>
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
