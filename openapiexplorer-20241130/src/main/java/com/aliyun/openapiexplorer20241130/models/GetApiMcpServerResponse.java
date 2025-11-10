// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetApiMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApiMcpServerResponseBody body;

    public static GetApiMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApiMcpServerResponse self = new GetApiMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public GetApiMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApiMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApiMcpServerResponse setBody(GetApiMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApiMcpServerResponseBody getBody() {
        return this.body;
    }

}
