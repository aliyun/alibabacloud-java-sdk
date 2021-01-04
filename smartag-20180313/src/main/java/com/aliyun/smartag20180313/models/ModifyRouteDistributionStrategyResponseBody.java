// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyRouteDistributionStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRouteDistributionStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteDistributionStrategyResponseBody self = new ModifyRouteDistributionStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRouteDistributionStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
