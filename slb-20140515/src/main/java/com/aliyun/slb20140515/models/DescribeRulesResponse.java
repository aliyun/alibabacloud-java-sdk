// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRulesResponseBody body;

    public static DescribeRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulesResponse self = new DescribeRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRulesResponse setBody(DescribeRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRulesResponseBody getBody() {
        return this.body;
    }

}
