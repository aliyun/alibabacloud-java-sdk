// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachPolicyToGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToGroupResponseBody self = new AttachPolicyToGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachPolicyToGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
