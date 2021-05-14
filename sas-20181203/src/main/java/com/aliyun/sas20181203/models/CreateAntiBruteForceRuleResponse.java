// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAntiBruteForceRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateAntiBruteForceRuleResponse setBody(CreateAntiBruteForceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntiBruteForceRuleResponseBody getBody() {
        return this.body;
    }

}
