// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class EnableGatewayLoggingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableGatewayLoggingResponseBody body;

    public static EnableGatewayLoggingResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableGatewayLoggingResponse self = new EnableGatewayLoggingResponse();
        return TeaModel.build(map, self);
    }

    public EnableGatewayLoggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableGatewayLoggingResponse setBody(EnableGatewayLoggingResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableGatewayLoggingResponseBody getBody() {
        return this.body;
    }

}
