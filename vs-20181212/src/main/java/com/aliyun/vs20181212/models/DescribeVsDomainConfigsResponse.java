// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVsDomainConfigsResponseBody body;

    public static DescribeVsDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainConfigsResponse self = new DescribeVsDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainConfigsResponse setBody(DescribeVsDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
