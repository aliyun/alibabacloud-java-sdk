// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class GetChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatResponseBody body;

    public static GetChatResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatResponse self = new GetChatResponse();
        return TeaModel.build(map, self);
    }

    public GetChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatResponse setBody(GetChatResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatResponseBody getBody() {
        return this.body;
    }

}
