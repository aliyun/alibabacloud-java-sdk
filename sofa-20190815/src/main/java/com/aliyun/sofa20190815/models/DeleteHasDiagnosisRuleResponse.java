// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasDiagnosisRuleResponseBody body;

    public static DeleteHasDiagnosisRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisRuleResponse self = new DeleteHasDiagnosisRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasDiagnosisRuleResponse setBody(DeleteHasDiagnosisRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasDiagnosisRuleResponseBody getBody() {
        return this.body;
    }

}
