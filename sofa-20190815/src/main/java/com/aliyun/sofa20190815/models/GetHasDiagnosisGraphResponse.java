// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisGraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisGraphResponseBody body;

    public static GetHasDiagnosisGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisGraphResponse self = new GetHasDiagnosisGraphResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisGraphResponse setBody(GetHasDiagnosisGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisGraphResponseBody getBody() {
        return this.body;
    }

}
