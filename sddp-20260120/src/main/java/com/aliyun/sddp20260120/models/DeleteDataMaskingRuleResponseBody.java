// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class DeleteDataMaskingRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can use the ID to locate the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataMaskingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataMaskingRuleResponseBody self = new DeleteDataMaskingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataMaskingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
