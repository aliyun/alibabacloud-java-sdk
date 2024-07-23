// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateEngineConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F8F613A9-DF1C-551A-88E1-397A3981A785</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEngineConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEngineConfigResponseBody self = new UpdateEngineConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEngineConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
