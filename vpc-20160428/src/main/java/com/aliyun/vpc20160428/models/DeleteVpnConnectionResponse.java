// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteVpnConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpnConnectionResponse setBody(DeleteVpnConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpnConnectionResponseBody getBody() {
        return this.body;
    }

}
