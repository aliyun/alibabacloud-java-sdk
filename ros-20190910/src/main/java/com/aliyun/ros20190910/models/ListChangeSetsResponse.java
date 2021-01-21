// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChangeSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListChangeSetsResponseBody body;

    public static ListChangeSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChangeSetsResponse self = new ListChangeSetsResponse();
        return TeaModel.build(map, self);
    }

    public ListChangeSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChangeSetsResponse setBody(ListChangeSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChangeSetsResponseBody getBody() {
        return this.body;
    }

}
