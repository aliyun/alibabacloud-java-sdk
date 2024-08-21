// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCDeploymentSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCDeploymentSetsResponseBody body;

    public static DescribeRCDeploymentSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCDeploymentSetsResponse self = new DescribeRCDeploymentSetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCDeploymentSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCDeploymentSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCDeploymentSetsResponse setBody(DescribeRCDeploymentSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCDeploymentSetsResponseBody getBody() {
        return this.body;
    }

}
