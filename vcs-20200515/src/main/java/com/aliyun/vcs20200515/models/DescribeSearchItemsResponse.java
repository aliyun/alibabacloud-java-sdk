// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeSearchItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSearchItemsResponseBody body;

    public static DescribeSearchItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchItemsResponse self = new DescribeSearchItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSearchItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSearchItemsResponse setBody(DescribeSearchItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSearchItemsResponseBody getBody() {
        return this.body;
    }

}
