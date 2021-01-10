// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectAkeworkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectAkeworkspaceResponseBody body;

    public static ListHasInspectAkeworkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectAkeworkspaceResponse self = new ListHasInspectAkeworkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectAkeworkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectAkeworkspaceResponse setBody(ListHasInspectAkeworkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectAkeworkspaceResponseBody getBody() {
        return this.body;
    }

}
