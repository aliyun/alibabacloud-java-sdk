// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasDiagnosisNodebindruleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasDiagnosisNodebindruleResponseBody body;

    public static ExecHasDiagnosisNodebindruleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasDiagnosisNodebindruleResponse self = new ExecHasDiagnosisNodebindruleResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasDiagnosisNodebindruleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasDiagnosisNodebindruleResponse setBody(ExecHasDiagnosisNodebindruleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasDiagnosisNodebindruleResponseBody getBody() {
        return this.body;
    }

}
