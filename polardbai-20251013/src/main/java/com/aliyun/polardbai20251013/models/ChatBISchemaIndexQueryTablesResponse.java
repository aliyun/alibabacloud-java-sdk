// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBISchemaIndexQueryTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBISchemaIndexQueryTablesResponseBody body;

    public static ChatBISchemaIndexQueryTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBISchemaIndexQueryTablesResponse self = new ChatBISchemaIndexQueryTablesResponse();
        return TeaModel.build(map, self);
    }

    public ChatBISchemaIndexQueryTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBISchemaIndexQueryTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBISchemaIndexQueryTablesResponse setBody(ChatBISchemaIndexQueryTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBISchemaIndexQueryTablesResponseBody getBody() {
        return this.body;
    }

}
