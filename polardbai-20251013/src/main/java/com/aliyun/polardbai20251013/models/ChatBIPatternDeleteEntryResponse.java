// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternDeleteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIPatternDeleteEntryResponseBody body;

    public static ChatBIPatternDeleteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternDeleteEntryResponse self = new ChatBIPatternDeleteEntryResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternDeleteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIPatternDeleteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIPatternDeleteEntryResponse setBody(ChatBIPatternDeleteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIPatternDeleteEntryResponseBody getBody() {
        return this.body;
    }

}
