// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisGraphnodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasDiagnosisGraphnodeResponseBody body;

    public static DeleteHasDiagnosisGraphnodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisGraphnodeResponse self = new DeleteHasDiagnosisGraphnodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisGraphnodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasDiagnosisGraphnodeResponse setBody(DeleteHasDiagnosisGraphnodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasDiagnosisGraphnodeResponseBody getBody() {
        return this.body;
    }

}
