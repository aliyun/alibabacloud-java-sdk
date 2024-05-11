// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetricsResponseBody body;

    public static ListMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetricsResponse self = new ListMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetricsResponse setBody(ListMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetricsResponseBody getBody() {
        return this.body;
    }

}
