// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AttachPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AttachPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyResponse self = new AttachPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AttachPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
