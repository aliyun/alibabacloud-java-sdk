// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200809.models;

import com.aliyun.tea.*;

public class ListSharedReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSharedReportsResponseBody body;

    public static ListSharedReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSharedReportsResponse self = new ListSharedReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListSharedReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSharedReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSharedReportsResponse setBody(ListSharedReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSharedReportsResponseBody getBody() {
        return this.body;
    }

}
