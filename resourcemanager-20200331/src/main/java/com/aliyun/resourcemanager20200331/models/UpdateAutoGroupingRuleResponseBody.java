// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAutoGroupingRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAutoGroupingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoGroupingRuleResponseBody self = new UpdateAutoGroupingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAutoGroupingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
