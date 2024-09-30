// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class DeletePolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4A32F5B0-0B0B-5537-B4A0-7A6E1C3AA96A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyResponseBody self = new DeletePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
