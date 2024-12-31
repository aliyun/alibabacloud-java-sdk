// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMetricMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetricMetaResponseBody body;

    public static ListMetricMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetricMetaResponse self = new ListMetricMetaResponse();
        return TeaModel.build(map, self);
    }

    public ListMetricMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetricMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetricMetaResponse setBody(ListMetricMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetricMetaResponseBody getBody() {
        return this.body;
    }

}
