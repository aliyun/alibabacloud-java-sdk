// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAIInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAIInstanceResponseBody body;

    public static DescribeAIInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIInstanceResponse self = new DescribeAIInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIInstanceResponse setBody(DescribeAIInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIInstanceResponseBody getBody() {
        return this.body;
    }

}
