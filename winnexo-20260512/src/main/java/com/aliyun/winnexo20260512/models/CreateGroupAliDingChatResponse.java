// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupAliDingChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupAliDingChatResponseBody body;

    public static CreateGroupAliDingChatResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupAliDingChatResponse self = new CreateGroupAliDingChatResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupAliDingChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupAliDingChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupAliDingChatResponse setBody(CreateGroupAliDingChatResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupAliDingChatResponseBody getBody() {
        return this.body;
    }

}
