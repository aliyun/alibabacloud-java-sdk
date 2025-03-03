// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteAutoGroupingRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAutoGroupingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoGroupingRuleResponseBody self = new DeleteAutoGroupingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAutoGroupingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
