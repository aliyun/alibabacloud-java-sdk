// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListObjectVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListObjectVersionsResponseBody body;

    public static ListObjectVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListObjectVersionsResponse self = new ListObjectVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListObjectVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListObjectVersionsResponse setBody(ListObjectVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListObjectVersionsResponseBody getBody() {
        return this.body;
    }

}
