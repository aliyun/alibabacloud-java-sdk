// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktRelatedlinkeiterationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktRelatedlinkeiterationsResponseBody body;

    public static ListLinkeLinktRelatedlinkeiterationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktRelatedlinkeiterationsResponse self = new ListLinkeLinktRelatedlinkeiterationsResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktRelatedlinkeiterationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktRelatedlinkeiterationsResponse setBody(ListLinkeLinktRelatedlinkeiterationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktRelatedlinkeiterationsResponseBody getBody() {
        return this.body;
    }

}
