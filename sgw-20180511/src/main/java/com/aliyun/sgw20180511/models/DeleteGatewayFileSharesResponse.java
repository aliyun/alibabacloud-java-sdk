// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteGatewayFileSharesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewayFileSharesResponseBody body;

    public static DeleteGatewayFileSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayFileSharesResponse self = new DeleteGatewayFileSharesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayFileSharesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayFileSharesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayFileSharesResponse setBody(DeleteGatewayFileSharesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayFileSharesResponseBody getBody() {
        return this.body;
    }

}
