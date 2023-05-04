// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DetachControlPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachControlPolicyResponseBody self = new DetachControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
