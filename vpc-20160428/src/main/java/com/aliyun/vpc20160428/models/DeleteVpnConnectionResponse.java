// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVpnConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnConnectionResponse self = new DeleteVpnConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpnConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
