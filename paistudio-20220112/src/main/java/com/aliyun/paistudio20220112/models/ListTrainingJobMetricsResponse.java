// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrainingJobMetricsResponseBody body;

    public static ListTrainingJobMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobMetricsResponse self = new ListTrainingJobMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrainingJobMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrainingJobMetricsResponse setBody(ListTrainingJobMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrainingJobMetricsResponseBody getBody() {
        return this.body;
    }

}
