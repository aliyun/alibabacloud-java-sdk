// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSampleMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJMeterSampleMetricsResponseBody body;

    public static GetJMeterSampleMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterSampleMetricsResponse self = new GetJMeterSampleMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetJMeterSampleMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJMeterSampleMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJMeterSampleMetricsResponse setBody(GetJMeterSampleMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJMeterSampleMetricsResponseBody getBody() {
        return this.body;
    }

}
