// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteRouteDistributionStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BF62139B-D64A-4C95-A55F-6A2335C4417D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRouteDistributionStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteDistributionStrategyResponseBody self = new DeleteRouteDistributionStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRouteDistributionStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
