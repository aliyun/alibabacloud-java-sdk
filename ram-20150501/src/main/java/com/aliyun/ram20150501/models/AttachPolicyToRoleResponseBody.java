// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToRoleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachPolicyToRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToRoleResponseBody self = new AttachPolicyToRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachPolicyToRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
