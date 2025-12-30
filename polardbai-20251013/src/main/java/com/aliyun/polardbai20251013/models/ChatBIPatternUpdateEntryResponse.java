// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternUpdateEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIPatternUpdateEntryResponseBody body;

    public static ChatBIPatternUpdateEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternUpdateEntryResponse self = new ChatBIPatternUpdateEntryResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternUpdateEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIPatternUpdateEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIPatternUpdateEntryResponse setBody(ChatBIPatternUpdateEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIPatternUpdateEntryResponseBody getBody() {
        return this.body;
    }

}
