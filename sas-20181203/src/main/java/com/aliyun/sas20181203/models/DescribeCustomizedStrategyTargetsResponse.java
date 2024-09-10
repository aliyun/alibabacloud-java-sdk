// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizedStrategyTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomizedStrategyTargetsResponseBody body;

    public static DescribeCustomizedStrategyTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedStrategyTargetsResponse self = new DescribeCustomizedStrategyTargetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedStrategyTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizedStrategyTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomizedStrategyTargetsResponse setBody(DescribeCustomizedStrategyTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomizedStrategyTargetsResponseBody getBody() {
        return this.body;
    }

}
