// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceIpWhitelistResponseBody extends TeaModel {
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
     * <p>87249A6F-xxx-804C-E1E0AD1FAD90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceIpWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceIpWhitelistResponseBody self = new ModifyInstanceIpWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceIpWhitelistResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceIpWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
