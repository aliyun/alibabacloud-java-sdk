// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsDomainBpsDataResponseBody body;

    public static DescribeVsDomainBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainBpsDataResponse self = new DescribeVsDomainBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDomainBpsDataResponse setBody(DescribeVsDomainBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainBpsDataResponseBody getBody() {
        return this.body;
    }

}
