// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectTaskverdictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectTaskverdictResponseBody body;

    public static ListHasInspectTaskverdictResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectTaskverdictResponse self = new ListHasInspectTaskverdictResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectTaskverdictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectTaskverdictResponse setBody(ListHasInspectTaskverdictResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectTaskverdictResponseBody getBody() {
        return this.body;
    }

}
