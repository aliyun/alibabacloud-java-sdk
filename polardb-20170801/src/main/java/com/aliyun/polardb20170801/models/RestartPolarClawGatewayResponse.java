// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartPolarClawGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartPolarClawGatewayResponseBody body;

    public static RestartPolarClawGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartPolarClawGatewayResponse self = new RestartPolarClawGatewayResponse();
        return TeaModel.build(map, self);
    }

    public RestartPolarClawGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartPolarClawGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartPolarClawGatewayResponse setBody(RestartPolarClawGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartPolarClawGatewayResponseBody getBody() {
        return this.body;
    }

}
