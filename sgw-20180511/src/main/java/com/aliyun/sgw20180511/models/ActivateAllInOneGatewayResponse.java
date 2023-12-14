// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ActivateAllInOneGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ActivateAllInOneGatewayResponseBody body;

    public static ActivateAllInOneGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateAllInOneGatewayResponse self = new ActivateAllInOneGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ActivateAllInOneGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateAllInOneGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateAllInOneGatewayResponse setBody(ActivateAllInOneGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateAllInOneGatewayResponseBody getBody() {
        return this.body;
    }

}
