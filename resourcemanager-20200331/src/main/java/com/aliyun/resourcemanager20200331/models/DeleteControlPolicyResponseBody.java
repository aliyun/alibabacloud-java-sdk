// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C8541E06-B207-46BF-92C9-DC8DE4609D75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteControlPolicyResponseBody self = new DeleteControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
