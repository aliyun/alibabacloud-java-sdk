// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcDeveloperRepoMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcDeveloperRepoMetricResult body;

    public static GetPbcDeveloperRepoMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPbcDeveloperRepoMetricsResponse self = new GetPbcDeveloperRepoMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetPbcDeveloperRepoMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPbcDeveloperRepoMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPbcDeveloperRepoMetricsResponse setBody(PbcDeveloperRepoMetricResult body) {
        this.body = body;
        return this;
    }
    public PbcDeveloperRepoMetricResult getBody() {
        return this.body;
    }

}
