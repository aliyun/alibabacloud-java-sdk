// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiConfigErrorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDpiConfigErrorResponseBody body;

    public static ListDpiConfigErrorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDpiConfigErrorResponse self = new ListDpiConfigErrorResponse();
        return TeaModel.build(map, self);
    }

    public ListDpiConfigErrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDpiConfigErrorResponse setBody(ListDpiConfigErrorResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDpiConfigErrorResponseBody getBody() {
        return this.body;
    }

}
