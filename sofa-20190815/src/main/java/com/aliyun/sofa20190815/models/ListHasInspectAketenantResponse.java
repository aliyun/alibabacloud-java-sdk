// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectAketenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectAketenantResponseBody body;

    public static ListHasInspectAketenantResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectAketenantResponse self = new ListHasInspectAketenantResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectAketenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectAketenantResponse setBody(ListHasInspectAketenantResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectAketenantResponseBody getBody() {
        return this.body;
    }

}
