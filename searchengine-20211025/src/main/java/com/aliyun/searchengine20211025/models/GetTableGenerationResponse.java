// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetTableGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableGenerationResponseBody body;

    public static GetTableGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableGenerationResponse self = new GetTableGenerationResponse();
        return TeaModel.build(map, self);
    }

    public GetTableGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableGenerationResponse setBody(GetTableGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableGenerationResponseBody getBody() {
        return this.body;
    }

}
