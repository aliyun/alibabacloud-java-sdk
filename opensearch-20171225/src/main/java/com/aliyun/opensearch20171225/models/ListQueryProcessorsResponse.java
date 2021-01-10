// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListQueryProcessorsResponseBody body;

    public static ListQueryProcessorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueryProcessorsResponse self = new ListQueryProcessorsResponse();
        return TeaModel.build(map, self);
    }

    public ListQueryProcessorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueryProcessorsResponse setBody(ListQueryProcessorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueryProcessorsResponseBody getBody() {
        return this.body;
    }

}
