// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIPatternCreateResponseBody body;

    public static ChatBIPatternCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternCreateResponse self = new ChatBIPatternCreateResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIPatternCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIPatternCreateResponse setBody(ChatBIPatternCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIPatternCreateResponseBody getBody() {
        return this.body;
    }

}
