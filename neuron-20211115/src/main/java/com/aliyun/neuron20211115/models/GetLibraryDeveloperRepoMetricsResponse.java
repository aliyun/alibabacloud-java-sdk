// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLibraryDeveloperRepoMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLibraryDeveloperRepoMetricsResponseBody body;

    public static GetLibraryDeveloperRepoMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryDeveloperRepoMetricsResponse self = new GetLibraryDeveloperRepoMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetLibraryDeveloperRepoMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLibraryDeveloperRepoMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLibraryDeveloperRepoMetricsResponse setBody(GetLibraryDeveloperRepoMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLibraryDeveloperRepoMetricsResponseBody getBody() {
        return this.body;
    }

}
