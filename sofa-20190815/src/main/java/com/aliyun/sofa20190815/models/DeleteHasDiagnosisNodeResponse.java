// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasDiagnosisNodeResponseBody body;

    public static DeleteHasDiagnosisNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisNodeResponse self = new DeleteHasDiagnosisNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasDiagnosisNodeResponse setBody(DeleteHasDiagnosisNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasDiagnosisNodeResponseBody getBody() {
        return this.body;
    }

}
