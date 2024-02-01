// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6GatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpv6GatewayResponseBody body;

    public static DeleteIpv6GatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6GatewayResponse self = new DeleteIpv6GatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpv6GatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpv6GatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpv6GatewayResponse setBody(DeleteIpv6GatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpv6GatewayResponseBody getBody() {
        return this.body;
    }

}
