// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetTaskExecutionStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskExecutionStatisticsResponseBody body;

    public static GetTaskExecutionStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskExecutionStatisticsResponse self = new GetTaskExecutionStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskExecutionStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskExecutionStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskExecutionStatisticsResponse setBody(GetTaskExecutionStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskExecutionStatisticsResponseBody getBody() {
        return this.body;
    }

}
