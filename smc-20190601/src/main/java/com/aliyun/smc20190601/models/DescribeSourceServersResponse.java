// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeSourceServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSourceServersResponseBody body;

    public static DescribeSourceServersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSourceServersResponse self = new DescribeSourceServersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSourceServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSourceServersResponse setBody(DescribeSourceServersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSourceServersResponseBody getBody() {
        return this.body;
    }

}
