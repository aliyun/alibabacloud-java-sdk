// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternQueryEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIPatternQueryEntriesResponseBody body;

    public static ChatBIPatternQueryEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternQueryEntriesResponse self = new ChatBIPatternQueryEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternQueryEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIPatternQueryEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIPatternQueryEntriesResponse setBody(ChatBIPatternQueryEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIPatternQueryEntriesResponseBody getBody() {
        return this.body;
    }

}
