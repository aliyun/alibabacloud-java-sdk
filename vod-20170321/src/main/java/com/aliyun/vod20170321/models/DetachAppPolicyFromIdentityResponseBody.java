// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DetachAppPolicyFromIdentityResponseBody extends TeaModel {
    /**
     * <p>The names of the policies that failed to be granted to the RAM user or RAM role.</p>
     */
    @NameInMap("FailedPolicyNames")
    public java.util.List<String> failedPolicyNames;

    /**
     * <p>The name of the policy that was not found.</p>
     */
    @NameInMap("NonExistPolicyNames")
    public java.util.List<String> nonExistPolicyNames;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-****-D7393642C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachAppPolicyFromIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachAppPolicyFromIdentityResponseBody self = new DetachAppPolicyFromIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachAppPolicyFromIdentityResponseBody setFailedPolicyNames(java.util.List<String> failedPolicyNames) {
        this.failedPolicyNames = failedPolicyNames;
        return this;
    }
    public java.util.List<String> getFailedPolicyNames() {
        return this.failedPolicyNames;
    }

    public DetachAppPolicyFromIdentityResponseBody setNonExistPolicyNames(java.util.List<String> nonExistPolicyNames) {
        this.nonExistPolicyNames = nonExistPolicyNames;
        return this;
    }
    public java.util.List<String> getNonExistPolicyNames() {
        return this.nonExistPolicyNames;
    }

    public DetachAppPolicyFromIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
