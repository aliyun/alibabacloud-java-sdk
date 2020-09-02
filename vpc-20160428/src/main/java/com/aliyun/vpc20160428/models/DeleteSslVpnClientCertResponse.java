// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteSslVpnClientCertResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteSslVpnClientCertResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSslVpnClientCertResponse self = new DeleteSslVpnClientCertResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSslVpnClientCertResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
