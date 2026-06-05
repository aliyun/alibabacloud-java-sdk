// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppChatMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppChatMessagesResponseBody body;

    public static ListAppChatMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppChatMessagesResponse self = new ListAppChatMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppChatMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppChatMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppChatMessagesResponse setBody(ListAppChatMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppChatMessagesResponseBody getBody() {
        return this.body;
    }

}
