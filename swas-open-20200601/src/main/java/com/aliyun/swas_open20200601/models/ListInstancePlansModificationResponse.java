// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstancePlansModificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstancePlansModificationResponseBody body;

    public static ListInstancePlansModificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePlansModificationResponse self = new ListInstancePlansModificationResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancePlansModificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancePlansModificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstancePlansModificationResponse setBody(ListInstancePlansModificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancePlansModificationResponseBody getBody() {
        return this.body;
    }

}
