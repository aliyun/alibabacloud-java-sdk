// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeCharsetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCharsetResponseBody body;

    public static DescribeCharsetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharsetResponse self = new DescribeCharsetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCharsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCharsetResponse setBody(DescribeCharsetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCharsetResponseBody getBody() {
        return this.body;
    }

}
