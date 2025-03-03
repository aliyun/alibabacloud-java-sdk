// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DetachControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9EA4F962-1A2E-4AFE-BE0C-B14736FC46CC</p>
     */
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
