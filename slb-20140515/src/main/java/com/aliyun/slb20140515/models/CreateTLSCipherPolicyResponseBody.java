// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateTLSCipherPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7A8875F-373A-5F48-8484-25B07A61F2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>tls-bp14bb1e7dll4f****</p>
     */
    @NameInMap("TLSCipherPolicyId")
    public String TLSCipherPolicyId;

    public static CreateTLSCipherPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTLSCipherPolicyResponseBody self = new CreateTLSCipherPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTLSCipherPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTLSCipherPolicyResponseBody setTLSCipherPolicyId(String TLSCipherPolicyId) {
        this.TLSCipherPolicyId = TLSCipherPolicyId;
        return this;
    }
    public String getTLSCipherPolicyId() {
        return this.TLSCipherPolicyId;
    }

}
