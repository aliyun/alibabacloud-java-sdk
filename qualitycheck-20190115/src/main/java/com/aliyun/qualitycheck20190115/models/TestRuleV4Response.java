// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TestRuleV4Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestRuleV4ResponseBody body;

    public static TestRuleV4Response build(java.util.Map<String, ?> map) throws Exception {
        TestRuleV4Response self = new TestRuleV4Response();
        return TeaModel.build(map, self);
    }

    public TestRuleV4Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestRuleV4Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestRuleV4Response setBody(TestRuleV4ResponseBody body) {
        this.body = body;
        return this;
    }
    public TestRuleV4ResponseBody getBody() {
        return this.body;
    }

}
