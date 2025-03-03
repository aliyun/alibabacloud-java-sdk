// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AttachControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>95060F1D-6990-4645-8920-A81D1BBFE992</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachControlPolicyResponseBody self = new AttachControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
