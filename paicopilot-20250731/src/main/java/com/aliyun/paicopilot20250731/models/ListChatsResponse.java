// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class ListChatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChatsResponseBody body;

    public static ListChatsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatsResponse self = new ListChatsResponse();
        return TeaModel.build(map, self);
    }

    public ListChatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatsResponse setBody(ListChatsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatsResponseBody getBody() {
        return this.body;
    }

}
