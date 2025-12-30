// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIPatternDeleteResponseBody body;

    public static ChatBIPatternDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternDeleteResponse self = new ChatBIPatternDeleteResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIPatternDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIPatternDeleteResponse setBody(ChatBIPatternDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIPatternDeleteResponseBody getBody() {
        return this.body;
    }

}
