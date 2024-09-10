// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBinarySecurityPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89AD16CC-97EE-50F3-9B12-9E28E5C8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBinarySecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBinarySecurityPolicyResponseBody self = new CreateBinarySecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBinarySecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
