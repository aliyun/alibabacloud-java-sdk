// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVpnConnectionResponseBody body;

    public static DeleteVpnConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnConnectionResponse self = new DeleteVpnConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpnConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpnConnectionResponse setBody(DeleteVpnConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpnConnectionResponseBody getBody() {
        return this.body;
    }

}
