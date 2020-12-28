// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRuleAttributeResponseBody body;

    public static DescribeRuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleAttributeResponse self = new DescribeRuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleAttributeResponse setBody(DescribeRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
