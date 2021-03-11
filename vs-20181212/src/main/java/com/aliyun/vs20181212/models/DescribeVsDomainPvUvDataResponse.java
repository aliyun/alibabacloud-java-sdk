// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainPvUvDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsDomainPvUvDataResponse setBody(DescribeVsDomainPvUvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainPvUvDataResponseBody getBody() {
        return this.body;
    }

}
