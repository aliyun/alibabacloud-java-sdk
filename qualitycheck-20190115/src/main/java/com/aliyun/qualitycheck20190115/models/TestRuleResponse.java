// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TestRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestRuleResponseBody body;

    public static TestRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        TestRuleResponse self = new TestRuleResponse();
        return TeaModel.build(map, self);
    }

    public TestRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestRuleResponse setBody(TestRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public TestRuleResponseBody getBody() {
        return this.body;
    }

}
