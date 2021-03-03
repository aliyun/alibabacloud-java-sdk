// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeInstanceInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceInfosResponseBody body;

    public static DescribeInstanceInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceInfosResponse self = new DescribeInstanceInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceInfosResponse setBody(DescribeInstanceInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceInfosResponseBody getBody() {
        return this.body;
    }

}
