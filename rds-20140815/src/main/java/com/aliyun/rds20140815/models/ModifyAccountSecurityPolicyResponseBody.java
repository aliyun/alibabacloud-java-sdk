// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyAccountSecurityPolicyResponseBody extends TeaModel {
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
