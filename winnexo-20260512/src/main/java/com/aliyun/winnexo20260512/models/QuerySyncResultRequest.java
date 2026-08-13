// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySyncResultRequest extends TeaModel {
    /**
     * <p>同步任务 ID（由 syncOrgStructure 返回）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static QuerySyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncResultRequest self = new QuerySyncResultRequest();
        return TeaModel.build(map, self);
    }

    public QuerySyncResultRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public QuerySyncResultRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
