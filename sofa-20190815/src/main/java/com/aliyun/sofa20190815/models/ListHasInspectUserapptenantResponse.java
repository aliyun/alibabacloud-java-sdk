// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectUserapptenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectUserapptenantResponseBody body;

    public static ListHasInspectUserapptenantResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectUserapptenantResponse self = new ListHasInspectUserapptenantResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectUserapptenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectUserapptenantResponse setBody(ListHasInspectUserapptenantResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectUserapptenantResponseBody getBody() {
        return this.body;
    }

}
