// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class DeleteAssociatedResourceRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BB532282-94F5-5F56-877F-32D5E2A04F3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAssociatedResourceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAssociatedResourceRuleResponseBody self = new DeleteAssociatedResourceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAssociatedResourceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
