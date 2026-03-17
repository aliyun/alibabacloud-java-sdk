// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteEdgeFunctionResponseBody extends TeaModel {
    /**
     * <p>fc-xxxx</p>
     * 
     * <strong>example:</strong>
     * <p>ef-****</p>
     */
    @NameInMap("EdgeFunctionName")
    public String edgeFunctionName;

    /**
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba***</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEdgeFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeFunctionResponseBody self = new DeleteEdgeFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeFunctionResponseBody setEdgeFunctionName(String edgeFunctionName) {
        this.edgeFunctionName = edgeFunctionName;
        return this;
    }
    public String getEdgeFunctionName() {
        return this.edgeFunctionName;
    }

    public DeleteEdgeFunctionResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DeleteEdgeFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
