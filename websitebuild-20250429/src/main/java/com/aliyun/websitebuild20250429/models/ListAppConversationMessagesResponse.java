// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppConversationMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppConversationMessagesResponseBody body;

    public static ListAppConversationMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppConversationMessagesResponse self = new ListAppConversationMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppConversationMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppConversationMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppConversationMessagesResponse setBody(ListAppConversationMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppConversationMessagesResponseBody getBody() {
        return this.body;
    }

}
