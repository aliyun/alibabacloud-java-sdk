// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBISchemaIndexDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBISchemaIndexDeleteResponseBody body;

    public static ChatBISchemaIndexDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBISchemaIndexDeleteResponse self = new ChatBISchemaIndexDeleteResponse();
        return TeaModel.build(map, self);
    }

    public ChatBISchemaIndexDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBISchemaIndexDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBISchemaIndexDeleteResponse setBody(ChatBISchemaIndexDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBISchemaIndexDeleteResponseBody getBody() {
        return this.body;
    }

}
