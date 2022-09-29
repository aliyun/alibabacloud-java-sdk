// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDeveloperRepoMetricSumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeveloperRepoMetricSumResponseBody body;

    public static ListDeveloperRepoMetricSumResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeveloperRepoMetricSumResponse self = new ListDeveloperRepoMetricSumResponse();
        return TeaModel.build(map, self);
    }

    public ListDeveloperRepoMetricSumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeveloperRepoMetricSumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeveloperRepoMetricSumResponse setBody(ListDeveloperRepoMetricSumResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeveloperRepoMetricSumResponseBody getBody() {
        return this.body;
    }

}
