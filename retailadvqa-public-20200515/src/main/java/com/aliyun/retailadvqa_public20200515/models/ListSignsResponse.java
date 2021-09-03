// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListSignsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSignsResponseBody body;

    public static ListSignsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSignsResponse self = new ListSignsResponse();
        return TeaModel.build(map, self);
    }

    public ListSignsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSignsResponse setBody(ListSignsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSignsResponseBody getBody() {
        return this.body;
    }

}
