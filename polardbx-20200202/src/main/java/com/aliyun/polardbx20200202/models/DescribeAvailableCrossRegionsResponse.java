// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeAvailableCrossRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailableCrossRegionsResponseBody body;

    public static DescribeAvailableCrossRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCrossRegionsResponse self = new DescribeAvailableCrossRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCrossRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableCrossRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableCrossRegionsResponse setBody(DescribeAvailableCrossRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableCrossRegionsResponseBody getBody() {
        return this.body;
    }

}
