// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListRecentViewReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecentViewReportsResponseBody body;

    public static ListRecentViewReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecentViewReportsResponse self = new ListRecentViewReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecentViewReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecentViewReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecentViewReportsResponse setBody(ListRecentViewReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecentViewReportsResponseBody getBody() {
        return this.body;
    }

}
