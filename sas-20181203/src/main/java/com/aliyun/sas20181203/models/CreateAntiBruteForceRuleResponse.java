// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAntiBruteForceRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAntiBruteForceRuleResponseBody body;

    public static CreateAntiBruteForceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntiBruteForceRuleResponse self = new CreateAntiBruteForceRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntiBruteForceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAntiBruteForceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAntiBruteForceRuleResponse setBody(CreateAntiBruteForceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntiBruteForceRuleResponseBody getBody() {
        return this.body;
    }

}
