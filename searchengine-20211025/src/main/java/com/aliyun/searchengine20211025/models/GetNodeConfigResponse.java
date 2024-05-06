// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetNodeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNodeConfigResponseBody body;

    public static GetNodeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeConfigResponse self = new GetNodeConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeConfigResponse setBody(GetNodeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeConfigResponseBody getBody() {
        return this.body;
    }

}
