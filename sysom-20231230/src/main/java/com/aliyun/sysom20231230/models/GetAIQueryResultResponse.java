// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAIQueryResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAIQueryResultResponseBody body;

    public static GetAIQueryResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIQueryResultResponse self = new GetAIQueryResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAIQueryResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIQueryResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAIQueryResultResponse setBody(GetAIQueryResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIQueryResultResponseBody getBody() {
        return this.body;
    }

}
