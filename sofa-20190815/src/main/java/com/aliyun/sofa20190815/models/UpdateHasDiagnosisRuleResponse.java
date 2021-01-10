// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasDiagnosisRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasDiagnosisRuleResponseBody body;

    public static UpdateHasDiagnosisRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasDiagnosisRuleResponse self = new UpdateHasDiagnosisRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasDiagnosisRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasDiagnosisRuleResponse setBody(UpdateHasDiagnosisRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasDiagnosisRuleResponseBody getBody() {
        return this.body;
    }

}
