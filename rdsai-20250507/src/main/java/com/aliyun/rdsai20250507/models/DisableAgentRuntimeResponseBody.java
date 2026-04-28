// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DisableAgentRuntimeResponseBody extends TeaModel {
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
     * <p>D984FD38-6C2D-55DF-B0D7-8BCAC2E1F8C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableAgentRuntimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAgentRuntimeResponseBody self = new DisableAgentRuntimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAgentRuntimeResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DisableAgentRuntimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
