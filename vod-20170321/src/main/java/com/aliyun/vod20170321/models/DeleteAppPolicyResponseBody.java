// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAppPolicyResponseBody extends TeaModel {
    @NameInMap("NonExistPolicyNames")
    public java.util.List<String> nonExistPolicyNames;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppPolicyResponseBody self = new DeleteAppPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppPolicyResponseBody setNonExistPolicyNames(java.util.List<String> nonExistPolicyNames) {
        this.nonExistPolicyNames = nonExistPolicyNames;
        return this;
    }
    public java.util.List<String> getNonExistPolicyNames() {
        return this.nonExistPolicyNames;
    }

    public DeleteAppPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
