// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectUserappnamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectUserappnamespaceResponseBody body;

    public static ListHasInspectUserappnamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectUserappnamespaceResponse self = new ListHasInspectUserappnamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectUserappnamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectUserappnamespaceResponse setBody(ListHasInspectUserappnamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectUserappnamespaceResponseBody getBody() {
        return this.body;
    }

}
