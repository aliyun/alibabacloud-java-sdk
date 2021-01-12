// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeActionEventPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeActionEventPolicyResponseBody body;

    public static DescribeActionEventPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActionEventPolicyResponse self = new DescribeActionEventPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActionEventPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActionEventPolicyResponse setBody(DescribeActionEventPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActionEventPolicyResponseBody getBody() {
        return this.body;
    }

}
