// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class DeleteVpcPeerConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcPeerConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcPeerConnectionResponseBody self = new DeleteVpcPeerConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcPeerConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
