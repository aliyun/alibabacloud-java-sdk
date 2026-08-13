// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskExecutionDetailRequest extends TeaModel {
    /**
     * <p>执行记录 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleExecutionId</p>
     */
    @NameInMap("executionId")
    public String executionId;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetScheduledTaskExecutionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskExecutionDetailRequest self = new GetScheduledTaskExecutionDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskExecutionDetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public GetScheduledTaskExecutionDetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
