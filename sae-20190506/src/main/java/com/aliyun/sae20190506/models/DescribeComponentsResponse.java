// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeComponentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeComponentsResponseBody body;

    public static DescribeComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentsResponse self = new DescribeComponentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComponentsResponse setBody(DescribeComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComponentsResponseBody getBody() {
        return this.body;
    }

}
