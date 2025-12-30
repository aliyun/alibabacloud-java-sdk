// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternIndexCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIPatternIndexCreateResponseBody body;

    public static ChatBIPatternIndexCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternIndexCreateResponse self = new ChatBIPatternIndexCreateResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternIndexCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIPatternIndexCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIPatternIndexCreateResponse setBody(ChatBIPatternIndexCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIPatternIndexCreateResponseBody getBody() {
        return this.body;
    }

}
