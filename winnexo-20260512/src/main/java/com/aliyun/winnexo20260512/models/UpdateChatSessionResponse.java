// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateChatSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateChatSessionResponseBody body;

    public static UpdateChatSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatSessionResponse self = new UpdateChatSessionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChatSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChatSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateChatSessionResponse setBody(UpdateChatSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChatSessionResponseBody getBody() {
        return this.body;
    }

}
