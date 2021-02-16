// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBLinksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBLinksResponseBody body;

    public static DescribeDBLinksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBLinksResponse self = new DescribeDBLinksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBLinksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBLinksResponse setBody(DescribeDBLinksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBLinksResponseBody getBody() {
        return this.body;
    }

}
