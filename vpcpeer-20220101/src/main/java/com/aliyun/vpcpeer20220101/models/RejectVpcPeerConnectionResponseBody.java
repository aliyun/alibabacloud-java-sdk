// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class RejectVpcPeerConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD2E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RejectVpcPeerConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RejectVpcPeerConnectionResponseBody self = new RejectVpcPeerConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public RejectVpcPeerConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
