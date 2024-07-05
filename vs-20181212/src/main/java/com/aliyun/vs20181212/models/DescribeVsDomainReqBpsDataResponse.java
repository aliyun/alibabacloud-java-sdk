// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainReqBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsDomainReqBpsDataResponseBody body;

    public static DescribeVsDomainReqBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainReqBpsDataResponse self = new DescribeVsDomainReqBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainReqBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainReqBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDomainReqBpsDataResponse setBody(DescribeVsDomainReqBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainReqBpsDataResponseBody getBody() {
        return this.body;
    }

}
