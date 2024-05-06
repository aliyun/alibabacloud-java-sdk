// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIndexResponseBody body;

    public static GetIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIndexResponse self = new GetIndexResponse();
        return TeaModel.build(map, self);
    }

    public GetIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIndexResponse setBody(GetIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIndexResponseBody getBody() {
        return this.body;
    }

}
