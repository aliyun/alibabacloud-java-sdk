// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class ListPublishedMmAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishedMmAppResponseBody body;

    public static ListPublishedMmAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedMmAppResponse self = new ListPublishedMmAppResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishedMmAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishedMmAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishedMmAppResponse setBody(ListPublishedMmAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishedMmAppResponseBody getBody() {
        return this.body;
    }

}
