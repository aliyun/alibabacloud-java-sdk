// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjectusedcustomfieldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktProjectusedcustomfieldsResponseBody body;

    public static ListLinkeLinktProjectusedcustomfieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjectusedcustomfieldsResponse self = new ListLinkeLinktProjectusedcustomfieldsResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjectusedcustomfieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktProjectusedcustomfieldsResponse setBody(ListLinkeLinktProjectusedcustomfieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktProjectusedcustomfieldsResponseBody getBody() {
        return this.body;
    }

}
