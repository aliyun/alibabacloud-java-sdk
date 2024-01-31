// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInstanceAntiBruteForceRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceAntiBruteForceRuleResponseBody body;

    public static ModifyInstanceAntiBruteForceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAntiBruteForceRuleResponse self = new ModifyInstanceAntiBruteForceRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAntiBruteForceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceAntiBruteForceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceAntiBruteForceRuleResponse setBody(ModifyInstanceAntiBruteForceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAntiBruteForceRuleResponseBody getBody() {
        return this.body;
    }

}
