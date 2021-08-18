// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallUserExpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCallUserExpResponseBody body;

    public static DescribeCallUserExpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallUserExpResponse self = new DescribeCallUserExpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCallUserExpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCallUserExpResponse setBody(DescribeCallUserExpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCallUserExpResponseBody getBody() {
        return this.body;
    }

}
