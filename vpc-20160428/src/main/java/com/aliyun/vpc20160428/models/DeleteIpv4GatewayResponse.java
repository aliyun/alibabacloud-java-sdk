// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv4GatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpv4GatewayResponseBody body;

    public static DeleteIpv4GatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv4GatewayResponse self = new DeleteIpv4GatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpv4GatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpv4GatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpv4GatewayResponse setBody(DeleteIpv4GatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpv4GatewayResponseBody getBody() {
        return this.body;
    }

}
