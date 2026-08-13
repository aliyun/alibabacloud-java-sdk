// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListChatSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChatSessionsResponseBody body;

    public static ListChatSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatSessionsResponse self = new ListChatSessionsResponse();
        return TeaModel.build(map, self);
    }

    public ListChatSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatSessionsResponse setBody(ListChatSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatSessionsResponseBody getBody() {
        return this.body;
    }

}
