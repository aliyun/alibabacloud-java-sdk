// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasDiagnosisNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasDiagnosisNodeResponseBody body;

    public static UpdateHasDiagnosisNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasDiagnosisNodeResponse self = new UpdateHasDiagnosisNodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasDiagnosisNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasDiagnosisNodeResponse setBody(UpdateHasDiagnosisNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasDiagnosisNodeResponseBody getBody() {
        return this.body;
    }

}
