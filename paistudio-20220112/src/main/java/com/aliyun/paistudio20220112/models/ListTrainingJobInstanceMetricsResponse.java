// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobInstanceMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrainingJobInstanceMetricsResponseBody body;

    public static ListTrainingJobInstanceMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobInstanceMetricsResponse self = new ListTrainingJobInstanceMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobInstanceMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrainingJobInstanceMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrainingJobInstanceMetricsResponse setBody(ListTrainingJobInstanceMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrainingJobInstanceMetricsResponseBody getBody() {
        return this.body;
    }

}
