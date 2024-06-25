// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DeleteSecurityPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7A8875F-373A-5F48-8484-25B07A61F2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityPolicyResponseBody self = new DeleteSecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
