// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAliDingChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalAliDingChatResponseBody body;

    public static CreatePersonalAliDingChatResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalAliDingChatResponse self = new CreatePersonalAliDingChatResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalAliDingChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalAliDingChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalAliDingChatResponse setBody(CreatePersonalAliDingChatResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalAliDingChatResponseBody getBody() {
        return this.body;
    }

}
