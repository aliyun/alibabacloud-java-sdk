// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyBinarySecurityPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID of the result.</p>
     * 
     * <strong>example:</strong>
     * <p>C699E4E4-F2F4-58FC-A949-457FFE59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBinarySecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBinarySecurityPolicyResponseBody self = new ModifyBinarySecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBinarySecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
