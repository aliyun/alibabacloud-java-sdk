// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DisableConversationShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableConversationShareResponseBody body;

    public static DisableConversationShareResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableConversationShareResponse self = new DisableConversationShareResponse();
        return TeaModel.build(map, self);
    }

    public DisableConversationShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableConversationShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableConversationShareResponse setBody(DisableConversationShareResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableConversationShareResponseBody getBody() {
        return this.body;
    }

}
