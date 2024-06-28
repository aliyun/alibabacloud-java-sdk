// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVcoRouteEntryWeightResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9496F8A-82F4-3130-A51A-2266ACC799B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVcoRouteEntryWeightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVcoRouteEntryWeightResponseBody self = new ModifyVcoRouteEntryWeightResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVcoRouteEntryWeightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
