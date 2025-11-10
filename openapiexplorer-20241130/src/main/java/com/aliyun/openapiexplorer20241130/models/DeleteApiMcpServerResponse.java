// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class DeleteApiMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApiMcpServerResponseBody body;

    public static DeleteApiMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiMcpServerResponse self = new DeleteApiMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApiMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApiMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApiMcpServerResponse setBody(DeleteApiMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApiMcpServerResponseBody getBody() {
        return this.body;
    }

}
