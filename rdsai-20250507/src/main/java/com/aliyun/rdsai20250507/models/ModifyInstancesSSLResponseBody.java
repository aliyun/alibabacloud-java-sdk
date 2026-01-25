// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstancesSSLResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[
     *     &quot;ra-supabase-xxx&quot;,
     *     &quot;ra-supabase-xxx&quot;
     *   ]</p>
     */
    @NameInMap("InstanceNames")
    public java.util.List<String> instanceNames;

    /**
     * <strong>example:</strong>
     * <p>32DEFB4A-xxxx-ADD5-918E4FD7AB8C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstancesSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstancesSSLResponseBody self = new ModifyInstancesSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstancesSSLResponseBody setInstanceNames(java.util.List<String> instanceNames) {
        this.instanceNames = instanceNames;
        return this;
    }
    public java.util.List<String> getInstanceNames() {
        return this.instanceNames;
    }

    public ModifyInstancesSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
