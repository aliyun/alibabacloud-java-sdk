// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DetachPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DetachPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyResponse self = new DetachPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DetachPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
