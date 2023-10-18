// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteSslVpnServerResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSslVpnServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSslVpnServerResponseBody self = new DeleteSslVpnServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSslVpnServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
