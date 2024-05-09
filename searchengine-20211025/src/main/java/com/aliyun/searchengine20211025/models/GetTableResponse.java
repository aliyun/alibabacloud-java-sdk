// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableResponseBody body;

    public static GetTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableResponse self = new GetTableResponse();
        return TeaModel.build(map, self);
    }

    public GetTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableResponse setBody(GetTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableResponseBody getBody() {
        return this.body;
    }

}
