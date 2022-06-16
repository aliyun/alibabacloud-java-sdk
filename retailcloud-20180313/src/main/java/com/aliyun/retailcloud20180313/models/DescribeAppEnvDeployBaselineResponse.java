// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppEnvDeployBaselineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppEnvDeployBaselineResponseBody body;

    public static DescribeAppEnvDeployBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvDeployBaselineResponse self = new DescribeAppEnvDeployBaselineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvDeployBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppEnvDeployBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppEnvDeployBaselineResponse setBody(DescribeAppEnvDeployBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppEnvDeployBaselineResponseBody getBody() {
        return this.body;
    }

}
