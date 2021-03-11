// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainUvDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsDomainUvDataResponse setBody(DescribeVsDomainUvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainUvDataResponseBody getBody() {
        return this.body;
    }

}
