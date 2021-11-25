// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeWatchItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWatchItemsResponseBody body;

    public static DescribeWatchItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWatchItemsResponse self = new DescribeWatchItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWatchItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWatchItemsResponse setBody(DescribeWatchItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWatchItemsResponseBody getBody() {
        return this.body;
    }

}
