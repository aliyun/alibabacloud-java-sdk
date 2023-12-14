// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class HandleGatewayAutoPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HandleGatewayAutoPlanResponseBody body;

    public static HandleGatewayAutoPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleGatewayAutoPlanResponse self = new HandleGatewayAutoPlanResponse();
        return TeaModel.build(map, self);
    }

    public HandleGatewayAutoPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandleGatewayAutoPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HandleGatewayAutoPlanResponse setBody(HandleGatewayAutoPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleGatewayAutoPlanResponseBody getBody() {
        return this.body;
    }

}
