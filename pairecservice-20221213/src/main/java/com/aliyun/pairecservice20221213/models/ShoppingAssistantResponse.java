// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ShoppingAssistantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ShoppingAssistantResponseBody body;

    public static ShoppingAssistantResponse build(java.util.Map<String, ?> map) throws Exception {
        ShoppingAssistantResponse self = new ShoppingAssistantResponse();
        return TeaModel.build(map, self);
    }

    public ShoppingAssistantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ShoppingAssistantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ShoppingAssistantResponse setBody(ShoppingAssistantResponseBody body) {
        this.body = body;
        return this;
    }
    public ShoppingAssistantResponseBody getBody() {
        return this.body;
    }

}
