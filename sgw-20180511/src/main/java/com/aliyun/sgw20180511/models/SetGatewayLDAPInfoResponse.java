// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SetGatewayLDAPInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetGatewayLDAPInfoResponseBody body;

    public static SetGatewayLDAPInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGatewayLDAPInfoResponse self = new SetGatewayLDAPInfoResponse();
        return TeaModel.build(map, self);
    }

    public SetGatewayLDAPInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGatewayLDAPInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetGatewayLDAPInfoResponse setBody(SetGatewayLDAPInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGatewayLDAPInfoResponseBody getBody() {
        return this.body;
    }

}
