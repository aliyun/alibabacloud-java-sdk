// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListABMetricGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListABMetricGroupsResponseBody body;

    public static ListABMetricGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListABMetricGroupsResponse self = new ListABMetricGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListABMetricGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListABMetricGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListABMetricGroupsResponse setBody(ListABMetricGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListABMetricGroupsResponseBody getBody() {
        return this.body;
    }

}
