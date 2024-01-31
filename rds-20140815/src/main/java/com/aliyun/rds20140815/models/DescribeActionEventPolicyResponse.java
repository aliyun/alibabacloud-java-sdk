// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeActionEventPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeActionEventPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActionEventPolicyResponse setBody(DescribeActionEventPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActionEventPolicyResponseBody getBody() {
        return this.body;
    }

}
