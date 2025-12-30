// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternQueryTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIPatternQueryTablesResponseBody body;

    public static ChatBIPatternQueryTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternQueryTablesResponse self = new ChatBIPatternQueryTablesResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternQueryTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIPatternQueryTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIPatternQueryTablesResponse setBody(ChatBIPatternQueryTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIPatternQueryTablesResponseBody getBody() {
        return this.body;
    }

}
