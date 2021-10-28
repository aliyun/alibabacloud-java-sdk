// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeOssBucketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOssBucketsResponseBody body;

    public static DescribeOssBucketsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketsResponse self = new DescribeOssBucketsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssBucketsResponse setBody(DescribeOssBucketsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssBucketsResponseBody getBody() {
        return this.body;
    }

}
