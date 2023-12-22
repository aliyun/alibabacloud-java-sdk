// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListABMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListABMetricsResponseBody body;

    public static ListABMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListABMetricsResponse self = new ListABMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListABMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListABMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListABMetricsResponse setBody(ListABMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListABMetricsResponseBody getBody() {
        return this.body;
    }

}
