// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVpnGatewayResponseBody body;

    public static DeleteVpnGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnGatewayResponse self = new DeleteVpnGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpnGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpnGatewayResponse setBody(DeleteVpnGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpnGatewayResponseBody getBody() {
        return this.body;
    }

}
