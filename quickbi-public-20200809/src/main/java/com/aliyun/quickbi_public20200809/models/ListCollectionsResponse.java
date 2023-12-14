// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200809.models;

import com.aliyun.tea.*;

public class ListCollectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCollectionsResponseBody body;

    public static ListCollectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCollectionsResponse self = new ListCollectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListCollectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCollectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCollectionsResponse setBody(ListCollectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCollectionsResponseBody getBody() {
        return this.body;
    }

}
