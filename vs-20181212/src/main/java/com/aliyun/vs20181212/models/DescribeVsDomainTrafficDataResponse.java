// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsDomainTrafficDataResponseBody body;

    public static DescribeVsDomainTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainTrafficDataResponse self = new DescribeVsDomainTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDomainTrafficDataResponse setBody(DescribeVsDomainTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainTrafficDataResponseBody getBody() {
        return this.body;
    }

}
