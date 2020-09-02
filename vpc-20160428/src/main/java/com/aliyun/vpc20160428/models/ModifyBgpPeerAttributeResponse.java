// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpPeerAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyBgpPeerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpPeerAttributeResponse self = new ModifyBgpPeerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBgpPeerAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
