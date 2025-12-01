// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CompareRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompareRuleResponseBody body;

    public static CompareRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareRuleResponse self = new CompareRuleResponse();
        return TeaModel.build(map, self);
    }

    public CompareRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompareRuleResponse setBody(CompareRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareRuleResponseBody getBody() {
        return this.body;
    }

}
