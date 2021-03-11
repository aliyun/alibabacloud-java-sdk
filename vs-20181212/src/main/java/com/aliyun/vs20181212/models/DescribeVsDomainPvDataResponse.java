// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainPvDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVsDomainPvDataResponseBody body;

    public static DescribeVsDomainPvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainPvDataResponse self = new DescribeVsDomainPvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainPvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainPvDataResponse setBody(DescribeVsDomainPvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainPvDataResponseBody getBody() {
        return this.body;
    }

}
