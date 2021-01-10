// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisJavaexeclogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisJavaexeclogResponseBody body;

    public static GetHasDiagnosisJavaexeclogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisJavaexeclogResponse self = new GetHasDiagnosisJavaexeclogResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisJavaexeclogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisJavaexeclogResponse setBody(GetHasDiagnosisJavaexeclogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisJavaexeclogResponseBody getBody() {
        return this.body;
    }

}
