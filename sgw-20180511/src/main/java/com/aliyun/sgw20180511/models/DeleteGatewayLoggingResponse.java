// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteGatewayLoggingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewayLoggingResponseBody body;

    public static DeleteGatewayLoggingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayLoggingResponse self = new DeleteGatewayLoggingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayLoggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayLoggingResponse setBody(DeleteGatewayLoggingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayLoggingResponseBody getBody() {
        return this.body;
    }

}
