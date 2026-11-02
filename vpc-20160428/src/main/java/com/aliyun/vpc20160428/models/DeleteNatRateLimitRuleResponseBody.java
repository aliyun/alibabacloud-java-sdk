// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNatRateLimitRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2315DEB7-5E92-423A-91F7-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNatRateLimitRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatRateLimitRuleResponseBody self = new DeleteNatRateLimitRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNatRateLimitRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
