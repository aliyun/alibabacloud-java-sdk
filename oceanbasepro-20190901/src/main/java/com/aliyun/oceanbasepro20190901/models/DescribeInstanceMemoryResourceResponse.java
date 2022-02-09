// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceMemoryResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceMemoryResourceResponseBody body;

    public static DescribeInstanceMemoryResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMemoryResourceResponse self = new DescribeInstanceMemoryResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMemoryResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceMemoryResourceResponse setBody(DescribeInstanceMemoryResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceMemoryResourceResponseBody getBody() {
        return this.body;
    }

}
