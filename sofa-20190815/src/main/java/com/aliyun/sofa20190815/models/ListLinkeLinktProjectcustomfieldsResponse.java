// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjectcustomfieldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktProjectcustomfieldsResponseBody body;

    public static ListLinkeLinktProjectcustomfieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjectcustomfieldsResponse self = new ListLinkeLinktProjectcustomfieldsResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjectcustomfieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktProjectcustomfieldsResponse setBody(ListLinkeLinktProjectcustomfieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktProjectcustomfieldsResponseBody getBody() {
        return this.body;
    }

}
