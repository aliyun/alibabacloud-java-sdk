// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneHasDiagnosisNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloneHasDiagnosisNodeResponseBody body;

    public static CloneHasDiagnosisNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneHasDiagnosisNodeResponse self = new CloneHasDiagnosisNodeResponse();
        return TeaModel.build(map, self);
    }

    public CloneHasDiagnosisNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneHasDiagnosisNodeResponse setBody(CloneHasDiagnosisNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneHasDiagnosisNodeResponseBody getBody() {
        return this.body;
    }

}
