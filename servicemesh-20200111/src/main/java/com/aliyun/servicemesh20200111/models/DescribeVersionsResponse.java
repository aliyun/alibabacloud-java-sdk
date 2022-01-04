// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVersionsResponseBody body;

    public static DescribeVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionsResponse self = new DescribeVersionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVersionsResponse setBody(DescribeVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVersionsResponseBody getBody() {
        return this.body;
    }

}
