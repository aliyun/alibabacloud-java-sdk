// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjectmodulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktProjectmodulesResponseBody body;

    public static ListLinkeLinktProjectmodulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjectmodulesResponse self = new ListLinkeLinktProjectmodulesResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjectmodulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktProjectmodulesResponse setBody(ListLinkeLinktProjectmodulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktProjectmodulesResponseBody getBody() {
        return this.body;
    }

}
