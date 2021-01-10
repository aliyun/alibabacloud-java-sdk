// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgUndisplayComponentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgUndisplayComponentsResponseBody body;

    public static ListMsSgUndisplayComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgUndisplayComponentsResponse self = new ListMsSgUndisplayComponentsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgUndisplayComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgUndisplayComponentsResponse setBody(ListMsSgUndisplayComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgUndisplayComponentsResponseBody getBody() {
        return this.body;
    }

}
