// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListHandshakesForResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHandshakesForResourceDirectoryResponseBody body;

    public static ListHandshakesForResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHandshakesForResourceDirectoryResponse self = new ListHandshakesForResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public ListHandshakesForResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHandshakesForResourceDirectoryResponse setBody(ListHandshakesForResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHandshakesForResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
