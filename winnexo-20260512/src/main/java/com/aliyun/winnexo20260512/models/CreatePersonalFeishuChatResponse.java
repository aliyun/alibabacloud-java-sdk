// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalFeishuChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalFeishuChatResponseBody body;

    public static CreatePersonalFeishuChatResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalFeishuChatResponse self = new CreatePersonalFeishuChatResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalFeishuChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalFeishuChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalFeishuChatResponse setBody(CreatePersonalFeishuChatResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalFeishuChatResponseBody getBody() {
        return this.body;
    }

}
