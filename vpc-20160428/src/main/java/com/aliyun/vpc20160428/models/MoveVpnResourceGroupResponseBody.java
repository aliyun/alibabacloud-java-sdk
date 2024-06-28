// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class MoveVpnResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89ED47AF-3319-566E-A5F5-94E3F47F54A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MoveVpnResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveVpnResourceGroupResponseBody self = new MoveVpnResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveVpnResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
