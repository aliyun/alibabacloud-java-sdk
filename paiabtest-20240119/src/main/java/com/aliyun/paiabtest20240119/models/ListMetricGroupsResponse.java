// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListMetricGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetricGroupsResponseBody body;

    public static ListMetricGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetricGroupsResponse self = new ListMetricGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListMetricGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetricGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetricGroupsResponse setBody(ListMetricGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetricGroupsResponseBody getBody() {
        return this.body;
    }

}
