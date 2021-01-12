// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBProxyResponseBody body;

    public static DescribeDBProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyResponse self = new DescribeDBProxyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBProxyResponse setBody(DescribeDBProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBProxyResponseBody getBody() {
        return this.body;
    }

}
