// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGrantRulesResponseBody body;

    public static DescribeGrantRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesResponse self = new DescribeGrantRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGrantRulesResponse setBody(DescribeGrantRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGrantRulesResponseBody getBody() {
        return this.body;
    }

}
