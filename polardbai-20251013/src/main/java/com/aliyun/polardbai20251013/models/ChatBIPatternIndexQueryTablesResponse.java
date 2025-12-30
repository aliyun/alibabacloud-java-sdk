// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternIndexQueryTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIPatternIndexQueryTablesResponseBody body;

    public static ChatBIPatternIndexQueryTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternIndexQueryTablesResponse self = new ChatBIPatternIndexQueryTablesResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternIndexQueryTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIPatternIndexQueryTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIPatternIndexQueryTablesResponse setBody(ChatBIPatternIndexQueryTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIPatternIndexQueryTablesResponseBody getBody() {
        return this.body;
    }

}
