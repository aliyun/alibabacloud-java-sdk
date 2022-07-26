// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetClusterInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterInfoResponseBody body;

    public static GetClusterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterInfoResponse self = new GetClusterInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterInfoResponse setBody(GetClusterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterInfoResponseBody getBody() {
        return this.body;
    }

}
