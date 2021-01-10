// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTTracesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDSTTracesResponseBody body;

    public static ListDSTTracesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDSTTracesResponse self = new ListDSTTracesResponse();
        return TeaModel.build(map, self);
    }

    public ListDSTTracesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDSTTracesResponse setBody(ListDSTTracesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDSTTracesResponseBody getBody() {
        return this.body;
    }

}
