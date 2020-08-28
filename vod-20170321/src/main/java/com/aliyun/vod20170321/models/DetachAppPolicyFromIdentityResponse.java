// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DetachAppPolicyFromIdentityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NonExistPolicyNames")
    @Validation(required = true)
    public java.util.List<String> nonExistPolicyNames;

    @NameInMap("FailedPolicyNames")
    @Validation(required = true)
    public java.util.List<String> failedPolicyNames;

    public static DetachAppPolicyFromIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachAppPolicyFromIdentityResponse self = new DetachAppPolicyFromIdentityResponse();
        return TeaModel.build(map, self);
    }

}
