// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpnConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnConnectionResponseBody self = new DeleteVpnConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpnConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
