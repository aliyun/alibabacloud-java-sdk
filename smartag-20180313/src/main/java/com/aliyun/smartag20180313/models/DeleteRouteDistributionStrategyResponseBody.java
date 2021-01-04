// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteRouteDistributionStrategyResponseBody extends TeaModel {
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
