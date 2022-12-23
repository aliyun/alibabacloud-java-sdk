// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DetachAppPolicyFromIdentityResponseBody extends TeaModel {
    // The name of the policy that failed to be detached from the identity.
    @NameInMap("FailedPolicyNames")
    public java.util.List<String> failedPolicyNames;

    // The name of the policy that was not found.
    @NameInMap("NonExistPolicyNames")
    public java.util.List<String> nonExistPolicyNames;

    // The ID of the request.
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
