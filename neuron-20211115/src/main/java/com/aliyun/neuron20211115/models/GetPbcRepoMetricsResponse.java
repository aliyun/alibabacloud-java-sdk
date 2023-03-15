// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcRepoMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcRepoMetricResult body;

    public static GetPbcRepoMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPbcRepoMetricsResponse self = new GetPbcRepoMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetPbcRepoMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPbcRepoMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPbcRepoMetricsResponse setBody(PbcRepoMetricResult body) {
        this.body = body;
        return this;
    }
    public PbcRepoMetricResult getBody() {
        return this.body;
    }

}
