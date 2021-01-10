// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectAkecellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectAkecellResponseBody body;

    public static ListHasInspectAkecellResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectAkecellResponse self = new ListHasInspectAkecellResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectAkecellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectAkecellResponse setBody(ListHasInspectAkecellResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectAkecellResponseBody getBody() {
        return this.body;
    }

}
