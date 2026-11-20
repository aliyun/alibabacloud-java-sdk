// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstancesSSLResponseBody extends TeaModel {
    /**
     * <p>The list of instance IDs of the AI applications that were successfully modified.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     &quot;ra-supabase-xxx&quot;,
     *     &quot;ra-supabase-xxx&quot;
     *   ]</p>
     */
    @NameInMap("InstanceNames")
    public java.util.List<String> instanceNames;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32DEFB4A-xxxx-ADD5-918E4FD7AB8C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The expiration time of the custom SSL certificate. The time is in the yyyy-MM-dd HH:mm:ss format and in the UTC+8 time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2027-12-31 23:59:59</p>
     */
    @NameInMap("SSLExpiredTime")
    public String SSLExpiredTime;

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

    public ModifyInstancesSSLResponseBody setSSLExpiredTime(String SSLExpiredTime) {
        this.SSLExpiredTime = SSLExpiredTime;
        return this;
    }
    public String getSSLExpiredTime() {
        return this.SSLExpiredTime;
    }

}
