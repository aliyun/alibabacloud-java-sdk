// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListObjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListObjectsResponseBody body;

    public static ListObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListObjectsResponse self = new ListObjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListObjectsResponse setBody(ListObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListObjectsResponseBody getBody() {
        return this.body;
    }

}
