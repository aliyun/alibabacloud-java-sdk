// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetChatSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatSessionResponseBody body;

    public static GetChatSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatSessionResponse self = new GetChatSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetChatSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatSessionResponse setBody(GetChatSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatSessionResponseBody getBody() {
        return this.body;
    }

}
