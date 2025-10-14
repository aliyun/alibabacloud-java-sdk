// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeEnabledCrossRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnabledCrossRegionsResponseBody body;

    public static DescribeEnabledCrossRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnabledCrossRegionsResponse self = new DescribeEnabledCrossRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnabledCrossRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnabledCrossRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnabledCrossRegionsResponse setBody(DescribeEnabledCrossRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnabledCrossRegionsResponseBody getBody() {
        return this.body;
    }

}
