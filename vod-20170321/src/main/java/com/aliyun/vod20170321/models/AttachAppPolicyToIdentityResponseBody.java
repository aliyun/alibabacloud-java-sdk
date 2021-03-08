// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AttachAppPolicyToIdentityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistPolicyNames")
    public java.util.List<String> nonExistPolicyNames;

    @NameInMap("FailedPolicyNames")
    public java.util.List<String> failedPolicyNames;

    public static AttachAppPolicyToIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachAppPolicyToIdentityResponseBody self = new AttachAppPolicyToIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachAppPolicyToIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachAppPolicyToIdentityResponseBody setNonExistPolicyNames(java.util.List<String> nonExistPolicyNames) {
        this.nonExistPolicyNames = nonExistPolicyNames;
        return this;
    }
    public java.util.List<String> getNonExistPolicyNames() {
        return this.nonExistPolicyNames;
    }

    public AttachAppPolicyToIdentityResponseBody setFailedPolicyNames(java.util.List<String> failedPolicyNames) {
        this.failedPolicyNames = failedPolicyNames;
        return this;
    }
    public java.util.List<String> getFailedPolicyNames() {
        return this.failedPolicyNames;
    }

}
