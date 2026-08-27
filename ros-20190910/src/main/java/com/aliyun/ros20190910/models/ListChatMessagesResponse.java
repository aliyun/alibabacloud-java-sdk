// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChatMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChatMessagesResponseBody body;

    public static ListChatMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatMessagesResponse self = new ListChatMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListChatMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatMessagesResponse setBody(ListChatMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatMessagesResponseBody getBody() {
        return this.body;
    }

}
