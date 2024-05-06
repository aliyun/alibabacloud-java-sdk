// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetIndexVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIndexVersionResponseBody body;

    public static GetIndexVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIndexVersionResponse self = new GetIndexVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetIndexVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIndexVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIndexVersionResponse setBody(GetIndexVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIndexVersionResponseBody getBody() {
        return this.body;
    }

}
