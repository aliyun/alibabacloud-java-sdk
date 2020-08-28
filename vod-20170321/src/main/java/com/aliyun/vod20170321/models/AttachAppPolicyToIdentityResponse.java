// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AttachAppPolicyToIdentityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NonExistPolicyNames")
    @Validation(required = true)
    public java.util.List<String> nonExistPolicyNames;

    @NameInMap("FailedPolicyNames")
    @Validation(required = true)
    public java.util.List<String> failedPolicyNames;

    public static AttachAppPolicyToIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachAppPolicyToIdentityResponse self = new AttachAppPolicyToIdentityResponse();
        return TeaModel.build(map, self);
    }

}
