// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainPvUvDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsDomainPvUvDataResponseBody body;

    public static DescribeVsDomainPvUvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainPvUvDataResponse self = new DescribeVsDomainPvUvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainPvUvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainPvUvDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDomainPvUvDataResponse setBody(DescribeVsDomainPvUvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainPvUvDataResponseBody getBody() {
        return this.body;
    }

}
