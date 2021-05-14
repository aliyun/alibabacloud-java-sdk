// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInstanceAntiBruteForceRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyInstanceAntiBruteForceRuleResponse setBody(ModifyInstanceAntiBruteForceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAntiBruteForceRuleResponseBody getBody() {
        return this.body;
    }

}
