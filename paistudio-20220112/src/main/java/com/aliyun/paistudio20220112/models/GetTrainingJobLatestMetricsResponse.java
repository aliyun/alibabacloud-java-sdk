// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetTrainingJobLatestMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrainingJobLatestMetricsResponseBody body;

    public static GetTrainingJobLatestMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrainingJobLatestMetricsResponse self = new GetTrainingJobLatestMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetTrainingJobLatestMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrainingJobLatestMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrainingJobLatestMetricsResponse setBody(GetTrainingJobLatestMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrainingJobLatestMetricsResponseBody getBody() {
        return this.body;
    }

}
