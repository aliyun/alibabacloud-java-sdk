// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobMetricsResponseBody body;

    public static GetJobMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobMetricsResponse self = new GetJobMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetJobMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobMetricsResponse setBody(GetJobMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobMetricsResponseBody getBody() {
        return this.body;
    }

}
