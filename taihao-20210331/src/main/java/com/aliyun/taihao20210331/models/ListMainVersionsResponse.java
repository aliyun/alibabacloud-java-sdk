// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListMainVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMainVersionsResponseBody body;

    public static ListMainVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMainVersionsResponse self = new ListMainVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListMainVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMainVersionsResponse setBody(ListMainVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMainVersionsResponseBody getBody() {
        return this.body;
    }

}
