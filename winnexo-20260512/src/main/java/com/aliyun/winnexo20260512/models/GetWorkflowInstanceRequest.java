// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceRequest extends TeaModel {
    /**
     * <p>The stable logical instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wfi_20261016_abc123</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The tenant ID. This is a common parameter. If you use winnexo-cli, pass this parameter explicitly by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceRequest self = new GetWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetWorkflowInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
