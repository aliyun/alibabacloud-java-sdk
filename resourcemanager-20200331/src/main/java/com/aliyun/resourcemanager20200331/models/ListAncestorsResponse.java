// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAncestorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAncestorsResponseBody body;

    public static ListAncestorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAncestorsResponse self = new ListAncestorsResponse();
        return TeaModel.build(map, self);
    }

    public ListAncestorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAncestorsResponse setBody(ListAncestorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAncestorsResponseBody getBody() {
        return this.body;
    }

}
