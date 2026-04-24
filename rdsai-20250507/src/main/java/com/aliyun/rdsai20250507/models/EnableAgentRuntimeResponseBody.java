// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class EnableAgentRuntimeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableAgentRuntimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAgentRuntimeResponseBody self = new EnableAgentRuntimeResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAgentRuntimeResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public EnableAgentRuntimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
