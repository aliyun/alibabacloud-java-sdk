// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListChatMessageContentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChatMessageContentsResponseBody body;

    public static ListChatMessageContentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatMessageContentsResponse self = new ListChatMessageContentsResponse();
        return TeaModel.build(map, self);
    }

    public ListChatMessageContentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatMessageContentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatMessageContentsResponse setBody(ListChatMessageContentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatMessageContentsResponseBody getBody() {
        return this.body;
    }

}
