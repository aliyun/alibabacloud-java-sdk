// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachPolicyToUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToUserResponseBody self = new AttachPolicyToUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachPolicyToUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
