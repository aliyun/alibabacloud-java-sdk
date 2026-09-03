// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260622.models;

import com.aliyun.tea.*;

public class GetSessionContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSessionContentResponseBody body;

    public static GetSessionContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSessionContentResponse self = new GetSessionContentResponse();
        return TeaModel.build(map, self);
    }

    public GetSessionContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSessionContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSessionContentResponse setBody(GetSessionContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSessionContentResponseBody getBody() {
        return this.body;
    }

}
