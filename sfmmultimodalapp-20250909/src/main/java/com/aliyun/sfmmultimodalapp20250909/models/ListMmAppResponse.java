// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class ListMmAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMmAppResponseBody body;

    public static ListMmAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMmAppResponse self = new ListMmAppResponse();
        return TeaModel.build(map, self);
    }

    public ListMmAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMmAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMmAppResponse setBody(ListMmAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMmAppResponseBody getBody() {
        return this.body;
    }

}
