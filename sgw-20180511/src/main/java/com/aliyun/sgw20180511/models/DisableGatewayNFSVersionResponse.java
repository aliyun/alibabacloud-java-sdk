// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DisableGatewayNFSVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableGatewayNFSVersionResponseBody body;

    public static DisableGatewayNFSVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableGatewayNFSVersionResponse self = new DisableGatewayNFSVersionResponse();
        return TeaModel.build(map, self);
    }

    public DisableGatewayNFSVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableGatewayNFSVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableGatewayNFSVersionResponse setBody(DisableGatewayNFSVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableGatewayNFSVersionResponseBody getBody() {
        return this.body;
    }

}
