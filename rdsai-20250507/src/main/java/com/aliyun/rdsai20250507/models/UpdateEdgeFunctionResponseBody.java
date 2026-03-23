// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateEdgeFunctionResponseBody extends TeaModel {
    /**
     * <p>fc-xxxx</p>
     * 
     * <strong>example:</strong>
     * <p>ef-****</p>
     */
    @NameInMap("EdgeFunctionName")
    public String edgeFunctionName;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEdgeFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeFunctionResponseBody self = new UpdateEdgeFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeFunctionResponseBody setEdgeFunctionName(String edgeFunctionName) {
        this.edgeFunctionName = edgeFunctionName;
        return this;
    }
    public String getEdgeFunctionName() {
        return this.edgeFunctionName;
    }

    public UpdateEdgeFunctionResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateEdgeFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
