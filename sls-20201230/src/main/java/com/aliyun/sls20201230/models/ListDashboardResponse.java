// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListDashboardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDashboardResponseBody body;

    public static ListDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardResponse self = new ListDashboardResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDashboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDashboardResponse setBody(ListDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardResponseBody getBody() {
        return this.body;
    }

}
