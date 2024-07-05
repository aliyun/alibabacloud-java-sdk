// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsDomainDetailResponseBody body;

    public static DescribeVsDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainDetailResponse self = new DescribeVsDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDomainDetailResponse setBody(DescribeVsDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainDetailResponseBody getBody() {
        return this.body;
    }

}
