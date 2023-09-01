// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSecurityScoreRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSecurityScoreRuleResponseBody body;

    public static GetSecurityScoreRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityScoreRuleResponse self = new GetSecurityScoreRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityScoreRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityScoreRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecurityScoreRuleResponse setBody(GetSecurityScoreRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityScoreRuleResponseBody getBody() {
        return this.body;
    }

}
