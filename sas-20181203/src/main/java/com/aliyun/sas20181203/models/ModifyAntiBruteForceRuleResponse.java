// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAntiBruteForceRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAntiBruteForceRuleResponseBody body;

    public static ModifyAntiBruteForceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAntiBruteForceRuleResponse self = new ModifyAntiBruteForceRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAntiBruteForceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAntiBruteForceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAntiBruteForceRuleResponse setBody(ModifyAntiBruteForceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAntiBruteForceRuleResponseBody getBody() {
        return this.body;
    }

}
