// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteSourceRequest extends TeaModel {
    /**
     * <p>待删除的数据源 ID（租户内唯一）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>781</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>21577</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static DeleteSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceRequest self = new DeleteSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSourceRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public DeleteSourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
