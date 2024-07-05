// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainReqTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsDomainReqTrafficDataResponseBody body;

    public static DescribeVsDomainReqTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainReqTrafficDataResponse self = new DescribeVsDomainReqTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainReqTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainReqTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDomainReqTrafficDataResponse setBody(DescribeVsDomainReqTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainReqTrafficDataResponseBody getBody() {
        return this.body;
    }

}
