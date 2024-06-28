// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectTrafficQosResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B457</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyExpressConnectTrafficQosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectTrafficQosResponseBody self = new ModifyExpressConnectTrafficQosResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectTrafficQosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
