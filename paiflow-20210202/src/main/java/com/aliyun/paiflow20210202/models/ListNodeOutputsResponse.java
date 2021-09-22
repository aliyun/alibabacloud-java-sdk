// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListNodeOutputsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodeOutputsResponseBody body;

    public static ListNodeOutputsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeOutputsResponse self = new ListNodeOutputsResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeOutputsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeOutputsResponse setBody(ListNodeOutputsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeOutputsResponseBody getBody() {
        return this.body;
    }

}
