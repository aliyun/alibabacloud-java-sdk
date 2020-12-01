// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListLogConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLogConfigsResponseBody body;

    public static ListLogConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogConfigsResponse self = new ListLogConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListLogConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogConfigsResponse setBody(ListLogConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogConfigsResponseBody getBody() {
        return this.body;
    }

}
