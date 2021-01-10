// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectUserapppodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectUserapppodResponseBody body;

    public static ListHasInspectUserapppodResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectUserapppodResponse self = new ListHasInspectUserapppodResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectUserapppodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectUserapppodResponse setBody(ListHasInspectUserapppodResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectUserapppodResponseBody getBody() {
        return this.body;
    }

}
