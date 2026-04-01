// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyAccountSecurityPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountSecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountSecurityPolicyResponseBody self = new ModifyAccountSecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountSecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
