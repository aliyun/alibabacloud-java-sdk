// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisFailedtaskinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisFailedtaskinfoResponseBody body;

    public static GetHasDiagnosisFailedtaskinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisFailedtaskinfoResponse self = new GetHasDiagnosisFailedtaskinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisFailedtaskinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisFailedtaskinfoResponse setBody(GetHasDiagnosisFailedtaskinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisFailedtaskinfoResponseBody getBody() {
        return this.body;
    }

}
