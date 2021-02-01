// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMarkerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMarkerResponseBody body;

    public static ListMarkerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMarkerResponse self = new ListMarkerResponse();
        return TeaModel.build(map, self);
    }

    public ListMarkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMarkerResponse setBody(ListMarkerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMarkerResponseBody getBody() {
        return this.body;
    }

}
