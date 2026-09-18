// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFeishuChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupFeishuChatResponseBody body;

    public static CreateGroupFeishuChatResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupFeishuChatResponse self = new CreateGroupFeishuChatResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupFeishuChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupFeishuChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupFeishuChatResponse setBody(CreateGroupFeishuChatResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupFeishuChatResponseBody getBody() {
        return this.body;
    }

}
