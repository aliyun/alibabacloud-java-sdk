// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyRouteDistributionStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>24C58BD0-1679-4942-9D42-00B635DAAADB</p>
     */
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
