// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktCustomfieldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktCustomfieldsResponseBody body;

    public static ListLinkeLinktCustomfieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktCustomfieldsResponse self = new ListLinkeLinktCustomfieldsResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktCustomfieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktCustomfieldsResponse setBody(ListLinkeLinktCustomfieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktCustomfieldsResponseBody getBody() {
        return this.body;
    }

}
