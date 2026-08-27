// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupDingtalkChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupDingtalkChatResponseBody body;

    public static CreateGroupDingtalkChatResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupDingtalkChatResponse self = new CreateGroupDingtalkChatResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupDingtalkChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupDingtalkChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupDingtalkChatResponse setBody(CreateGroupDingtalkChatResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupDingtalkChatResponseBody getBody() {
        return this.body;
    }

}
