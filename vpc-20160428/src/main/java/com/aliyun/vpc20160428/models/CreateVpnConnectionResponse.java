// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpnConnectionResponseBody body;

    public static CreateVpnConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnConnectionResponse self = new CreateVpnConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpnConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpnConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpnConnectionResponse setBody(CreateVpnConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpnConnectionResponseBody getBody() {
        return this.body;
    }

}
