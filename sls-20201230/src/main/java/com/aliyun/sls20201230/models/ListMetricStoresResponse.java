// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMetricStoresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetricStoresResponseBody body;

    public static ListMetricStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetricStoresResponse self = new ListMetricStoresResponse();
        return TeaModel.build(map, self);
    }

    public ListMetricStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetricStoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetricStoresResponse setBody(ListMetricStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetricStoresResponseBody getBody() {
        return this.body;
    }

}
