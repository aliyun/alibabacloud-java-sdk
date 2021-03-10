// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListMenuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMenuResponseBody body;

    public static ListMenuResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMenuResponse self = new ListMenuResponse();
        return TeaModel.build(map, self);
    }

    public ListMenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMenuResponse setBody(ListMenuResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMenuResponseBody getBody() {
        return this.body;
    }

}
