// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListPatrolReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPatrolReportsResponseBody body;

    public static ListPatrolReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPatrolReportsResponse self = new ListPatrolReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListPatrolReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPatrolReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPatrolReportsResponse setBody(ListPatrolReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPatrolReportsResponseBody getBody() {
        return this.body;
    }

}
