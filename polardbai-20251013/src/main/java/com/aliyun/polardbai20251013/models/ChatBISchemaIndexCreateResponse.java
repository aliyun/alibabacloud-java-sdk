// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBISchemaIndexCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBISchemaIndexCreateResponseBody body;

    public static ChatBISchemaIndexCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBISchemaIndexCreateResponse self = new ChatBISchemaIndexCreateResponse();
        return TeaModel.build(map, self);
    }

    public ChatBISchemaIndexCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBISchemaIndexCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBISchemaIndexCreateResponse setBody(ChatBISchemaIndexCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBISchemaIndexCreateResponseBody getBody() {
        return this.body;
    }

}
