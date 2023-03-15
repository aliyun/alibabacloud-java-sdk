// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListServiceMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorMetricResult body;

    public static ListServiceMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceMetricsResponse self = new ListServiceMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceMetricsResponse setBody(MonitorMetricResult body) {
        this.body = body;
        return this;
    }
    public MonitorMetricResult getBody() {
        return this.body;
    }

}
