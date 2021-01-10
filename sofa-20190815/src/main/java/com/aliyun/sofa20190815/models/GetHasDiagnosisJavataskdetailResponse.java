// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisJavataskdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisJavataskdetailResponseBody body;

    public static GetHasDiagnosisJavataskdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisJavataskdetailResponse self = new GetHasDiagnosisJavataskdetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisJavataskdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisJavataskdetailResponse setBody(GetHasDiagnosisJavataskdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisJavataskdetailResponseBody getBody() {
        return this.body;
    }

}
