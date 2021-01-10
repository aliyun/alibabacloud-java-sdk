// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeSubConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSubConnectionResponseBody body;

    public static DescribeSubConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubConnectionResponse self = new DescribeSubConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubConnectionResponse setBody(DescribeSubConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubConnectionResponseBody getBody() {
        return this.body;
    }

}
