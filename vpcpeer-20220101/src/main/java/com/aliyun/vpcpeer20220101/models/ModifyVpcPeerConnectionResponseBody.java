// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ModifyVpcPeerConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>880C99E1-449B-524A-B81F-1EC53D2A7EAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcPeerConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcPeerConnectionResponseBody self = new ModifyVpcPeerConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcPeerConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
