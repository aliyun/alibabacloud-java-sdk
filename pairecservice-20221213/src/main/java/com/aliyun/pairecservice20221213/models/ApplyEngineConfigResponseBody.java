// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ApplyEngineConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F8F613A9-DF1C-551A-88E1-397A3981A785</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyEngineConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyEngineConfigResponseBody self = new ApplyEngineConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyEngineConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
