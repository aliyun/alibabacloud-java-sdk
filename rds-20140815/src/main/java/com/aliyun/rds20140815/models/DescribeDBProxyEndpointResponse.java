// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBProxyEndpointResponseBody body;

    public static DescribeDBProxyEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyEndpointResponse self = new DescribeDBProxyEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBProxyEndpointResponse setBody(DescribeDBProxyEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBProxyEndpointResponseBody getBody() {
        return this.body;
    }

}
