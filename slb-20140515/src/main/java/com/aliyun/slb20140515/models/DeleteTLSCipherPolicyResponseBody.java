// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteTLSCipherPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTLSCipherPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTLSCipherPolicyResponseBody self = new DeleteTLSCipherPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTLSCipherPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
