// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AttachAppPolicyToIdentityResponseBody extends TeaModel {
    @NameInMap("FailedPolicyNames")
    public java.util.List<String> failedPolicyNames;

    @NameInMap("NonExistPolicyNames")
    public java.util.List<String> nonExistPolicyNames;

    /**
     * <p>Authorizes the specified identity to access the applications of ApsaraVideo VOD. The identity may be a RAM user or RAM role.</p>
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
