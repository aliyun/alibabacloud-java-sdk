// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainUvDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsDomainUvDataResponseBody body;

    public static DescribeVsDomainUvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainUvDataResponse self = new DescribeVsDomainUvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainUvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainUvDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDomainUvDataResponse setBody(DescribeVsDomainUvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainUvDataResponseBody getBody() {
        return this.body;
    }

}
