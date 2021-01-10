// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasDiagnosisNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasDiagnosisNodeResponseBody body;

    public static CreateHasDiagnosisNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasDiagnosisNodeResponse self = new CreateHasDiagnosisNodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasDiagnosisNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasDiagnosisNodeResponse setBody(CreateHasDiagnosisNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasDiagnosisNodeResponseBody getBody() {
        return this.body;
    }

}
