// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppConversationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppConversationsResponseBody body;

    public static ListAppConversationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppConversationsResponse self = new ListAppConversationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppConversationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppConversationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppConversationsResponse setBody(ListAppConversationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppConversationsResponseBody getBody() {
        return this.body;
    }

}
