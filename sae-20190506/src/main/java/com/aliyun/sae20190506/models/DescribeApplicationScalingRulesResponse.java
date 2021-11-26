// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApplicationScalingRulesResponseBody body;

    public static DescribeApplicationScalingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRulesResponse self = new DescribeApplicationScalingRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationScalingRulesResponse setBody(DescribeApplicationScalingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationScalingRulesResponseBody getBody() {
        return this.body;
    }

}
