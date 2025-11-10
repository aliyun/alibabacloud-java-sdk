// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class UpdateApiMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApiMcpServerResponseBody body;

    public static UpdateApiMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiMcpServerResponse self = new UpdateApiMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApiMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApiMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApiMcpServerResponse setBody(UpdateApiMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApiMcpServerResponseBody getBody() {
        return this.body;
    }

}
