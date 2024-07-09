// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteResolverRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C9959BE-3A6A-4803-8DCE-973B42ACD599</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResolverRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResolverRuleResponseBody self = new DeleteResolverRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResolverRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
