// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceAvailableResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceAvailableResourceResponseBody body;

    public static DescribeInstanceAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAvailableResourceResponse self = new DescribeInstanceAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAvailableResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAvailableResourceResponse setBody(DescribeInstanceAvailableResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAvailableResourceResponseBody getBody() {
        return this.body;
    }

}
