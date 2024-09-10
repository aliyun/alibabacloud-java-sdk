// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBinarySecurityPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A6CFADC0-1167-521A-9284-8CD8034C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBinarySecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBinarySecurityPolicyResponseBody self = new DeleteBinarySecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBinarySecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
