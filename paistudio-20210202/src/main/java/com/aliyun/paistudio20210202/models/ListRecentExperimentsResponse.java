// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListRecentExperimentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRecentExperimentsResponseBody body;

    public static ListRecentExperimentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecentExperimentsResponse self = new ListRecentExperimentsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecentExperimentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecentExperimentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecentExperimentsResponse setBody(ListRecentExperimentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecentExperimentsResponseBody getBody() {
        return this.body;
    }

}
