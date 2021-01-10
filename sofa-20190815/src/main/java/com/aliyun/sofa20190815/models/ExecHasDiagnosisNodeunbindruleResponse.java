// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasDiagnosisNodeunbindruleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasDiagnosisNodeunbindruleResponseBody body;

    public static ExecHasDiagnosisNodeunbindruleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasDiagnosisNodeunbindruleResponse self = new ExecHasDiagnosisNodeunbindruleResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasDiagnosisNodeunbindruleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasDiagnosisNodeunbindruleResponse setBody(ExecHasDiagnosisNodeunbindruleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasDiagnosisNodeunbindruleResponseBody getBody() {
        return this.body;
    }

}
