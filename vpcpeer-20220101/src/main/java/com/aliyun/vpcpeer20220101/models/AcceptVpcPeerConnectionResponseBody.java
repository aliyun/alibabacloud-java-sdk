// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class AcceptVpcPeerConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AcceptVpcPeerConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptVpcPeerConnectionResponseBody self = new AcceptVpcPeerConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptVpcPeerConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
