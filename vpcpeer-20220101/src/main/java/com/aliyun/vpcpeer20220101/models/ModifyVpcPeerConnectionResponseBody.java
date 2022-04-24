// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ModifyVpcPeerConnectionResponseBody extends TeaModel {
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
