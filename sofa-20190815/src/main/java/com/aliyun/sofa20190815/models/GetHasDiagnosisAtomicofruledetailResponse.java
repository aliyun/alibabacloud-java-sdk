// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisAtomicofruledetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisAtomicofruledetailResponseBody body;

    public static GetHasDiagnosisAtomicofruledetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisAtomicofruledetailResponse self = new GetHasDiagnosisAtomicofruledetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisAtomicofruledetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisAtomicofruledetailResponse setBody(GetHasDiagnosisAtomicofruledetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisAtomicofruledetailResponseBody getBody() {
        return this.body;
    }

}
