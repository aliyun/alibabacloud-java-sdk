// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeRequestGraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRequestGraphResponseBody body;

    public static DescribeRequestGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestGraphResponse self = new DescribeRequestGraphResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRequestGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRequestGraphResponse setBody(DescribeRequestGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRequestGraphResponseBody getBody() {
        return this.body;
    }

}
