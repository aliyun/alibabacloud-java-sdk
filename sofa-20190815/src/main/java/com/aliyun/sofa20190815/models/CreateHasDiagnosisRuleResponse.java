// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasDiagnosisRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasDiagnosisRuleResponseBody body;

    public static CreateHasDiagnosisRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasDiagnosisRuleResponse self = new CreateHasDiagnosisRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasDiagnosisRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasDiagnosisRuleResponse setBody(CreateHasDiagnosisRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasDiagnosisRuleResponseBody getBody() {
        return this.body;
    }

}
