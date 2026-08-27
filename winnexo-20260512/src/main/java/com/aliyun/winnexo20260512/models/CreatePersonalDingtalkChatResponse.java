// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalDingtalkChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalDingtalkChatResponseBody body;

    public static CreatePersonalDingtalkChatResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDingtalkChatResponse self = new CreatePersonalDingtalkChatResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDingtalkChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalDingtalkChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalDingtalkChatResponse setBody(CreatePersonalDingtalkChatResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalDingtalkChatResponseBody getBody() {
        return this.body;
    }

}
