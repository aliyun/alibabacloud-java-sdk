// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectUserappcellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectUserappcellResponseBody body;

    public static ListHasInspectUserappcellResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectUserappcellResponse self = new ListHasInspectUserappcellResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectUserappcellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectUserappcellResponse setBody(ListHasInspectUserappcellResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectUserappcellResponseBody getBody() {
        return this.body;
    }

}
