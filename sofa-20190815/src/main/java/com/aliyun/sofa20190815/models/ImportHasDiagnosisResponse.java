// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportHasDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportHasDiagnosisResponseBody body;

    public static ImportHasDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportHasDiagnosisResponse self = new ImportHasDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public ImportHasDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportHasDiagnosisResponse setBody(ImportHasDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportHasDiagnosisResponseBody getBody() {
        return this.body;
    }

}
