// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVRoutersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVRoutersResponseBody body;

    public static DescribeVRoutersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVRoutersResponse self = new DescribeVRoutersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVRoutersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVRoutersResponse setBody(DescribeVRoutersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVRoutersResponseBody getBody() {
        return this.body;
    }

}
