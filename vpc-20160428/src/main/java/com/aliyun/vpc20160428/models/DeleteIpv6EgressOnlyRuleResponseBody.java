// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6EgressOnlyRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DFEDBEE-E5AB-49E8-A2DC-CC114C67AF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpv6EgressOnlyRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6EgressOnlyRuleResponseBody self = new DeleteIpv6EgressOnlyRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpv6EgressOnlyRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
