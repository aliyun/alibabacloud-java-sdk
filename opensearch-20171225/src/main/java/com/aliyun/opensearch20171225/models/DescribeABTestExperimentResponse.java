// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeABTestExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeABTestExperimentResponseBody body;

    public static DescribeABTestExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeABTestExperimentResponse self = new DescribeABTestExperimentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeABTestExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeABTestExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeABTestExperimentResponse setBody(DescribeABTestExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeABTestExperimentResponseBody getBody() {
        return this.body;
    }

}
