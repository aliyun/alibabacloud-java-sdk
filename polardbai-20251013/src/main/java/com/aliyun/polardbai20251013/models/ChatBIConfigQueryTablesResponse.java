// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIConfigQueryTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIConfigQueryTablesResponseBody body;

    public static ChatBIConfigQueryTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIConfigQueryTablesResponse self = new ChatBIConfigQueryTablesResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIConfigQueryTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIConfigQueryTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIConfigQueryTablesResponse setBody(ChatBIConfigQueryTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIConfigQueryTablesResponseBody getBody() {
        return this.body;
    }

}
