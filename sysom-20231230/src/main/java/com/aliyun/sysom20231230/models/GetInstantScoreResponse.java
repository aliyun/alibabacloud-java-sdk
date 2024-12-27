// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetInstantScoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstantScoreResponseBody body;

    public static GetInstantScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstantScoreResponse self = new GetInstantScoreResponse();
        return TeaModel.build(map, self);
    }

    public GetInstantScoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstantScoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstantScoreResponse setBody(GetInstantScoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstantScoreResponseBody getBody() {
        return this.body;
    }

}
