// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class UpdateAssociatedResourceRuleResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94E16BB6-3FB6-1297-B5B2-ED2250F437CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAssociatedResourceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssociatedResourceRuleResponseBody self = new UpdateAssociatedResourceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAssociatedResourceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
