// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class AttachPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyResponseBody self = new AttachPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
