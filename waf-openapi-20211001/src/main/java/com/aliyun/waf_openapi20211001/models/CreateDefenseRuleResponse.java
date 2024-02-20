// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDefenseRuleResponseBody body;

    public static CreateDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseRuleResponse self = new CreateDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDefenseRuleResponse setBody(CreateDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
