// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListBucketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBucketsResponseBody body;

    public static ListBucketsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBucketsResponse self = new ListBucketsResponse();
        return TeaModel.build(map, self);
    }

    public ListBucketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBucketsResponse setBody(ListBucketsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBucketsResponseBody getBody() {
        return this.body;
    }

}
