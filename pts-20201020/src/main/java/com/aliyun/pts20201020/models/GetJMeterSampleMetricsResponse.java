// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSampleMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetJMeterSampleMetricsResponse setBody(GetJMeterSampleMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJMeterSampleMetricsResponseBody getBody() {
        return this.body;
    }

}
