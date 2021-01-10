// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjectongoingiterationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktProjectongoingiterationsResponseBody body;

    public static ListLinkeLinktProjectongoingiterationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjectongoingiterationsResponse self = new ListLinkeLinktProjectongoingiterationsResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjectongoingiterationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktProjectongoingiterationsResponse setBody(ListLinkeLinktProjectongoingiterationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktProjectongoingiterationsResponseBody getBody() {
        return this.body;
    }

}
