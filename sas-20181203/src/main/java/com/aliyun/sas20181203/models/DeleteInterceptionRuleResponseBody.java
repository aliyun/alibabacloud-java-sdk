// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteInterceptionRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53CXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInterceptionRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInterceptionRuleResponseBody self = new DeleteInterceptionRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInterceptionRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
