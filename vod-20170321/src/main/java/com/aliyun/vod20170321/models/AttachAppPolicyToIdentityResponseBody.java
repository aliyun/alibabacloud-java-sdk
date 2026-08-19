// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AttachAppPolicyToIdentityResponseBody extends TeaModel {
    /**
     * <p>The policy names that failed to be attached.</p>
     */
    @NameInMap("FailedPolicyNames")
    public java.util.List<String> failedPolicyNames;

    /**
     * <p>The list of policy names that do not exist.</p>
     */
    @NameInMap("NonExistPolicyNames")
    public java.util.List<String> nonExistPolicyNames;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-****-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachAppPolicyToIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachAppPolicyToIdentityResponseBody self = new AttachAppPolicyToIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachAppPolicyToIdentityResponseBody setFailedPolicyNames(java.util.List<String> failedPolicyNames) {
        this.failedPolicyNames = failedPolicyNames;
        return this;
    }
    public java.util.List<String> getFailedPolicyNames() {
        return this.failedPolicyNames;
    }

    public AttachAppPolicyToIdentityResponseBody setNonExistPolicyNames(java.util.List<String> nonExistPolicyNames) {
        this.nonExistPolicyNames = nonExistPolicyNames;
        return this;
    }
    public java.util.List<String> getNonExistPolicyNames() {
        return this.nonExistPolicyNames;
    }

    public AttachAppPolicyToIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
