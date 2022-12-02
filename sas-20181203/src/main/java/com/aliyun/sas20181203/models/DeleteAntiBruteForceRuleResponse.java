// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAntiBruteForceRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAntiBruteForceRuleResponseBody body;

    public static DeleteAntiBruteForceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntiBruteForceRuleResponse self = new DeleteAntiBruteForceRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAntiBruteForceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAntiBruteForceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAntiBruteForceRuleResponse setBody(DeleteAntiBruteForceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAntiBruteForceRuleResponseBody getBody() {
        return this.body;
    }

}
