// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class EnableConversationShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableConversationShareResponseBody body;

    public static EnableConversationShareResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableConversationShareResponse self = new EnableConversationShareResponse();
        return TeaModel.build(map, self);
    }

    public EnableConversationShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableConversationShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableConversationShareResponse setBody(EnableConversationShareResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableConversationShareResponseBody getBody() {
        return this.body;
    }

}
