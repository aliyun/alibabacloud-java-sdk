// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListABMetricGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
