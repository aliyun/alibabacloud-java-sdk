// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeSecurityScoreRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeSecurityScoreRuleResponseBody body;

    public static ChangeSecurityScoreRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeSecurityScoreRuleResponse self = new ChangeSecurityScoreRuleResponse();
        return TeaModel.build(map, self);
    }

    public ChangeSecurityScoreRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeSecurityScoreRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeSecurityScoreRuleResponse setBody(ChangeSecurityScoreRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeSecurityScoreRuleResponseBody getBody() {
        return this.body;
    }

}
