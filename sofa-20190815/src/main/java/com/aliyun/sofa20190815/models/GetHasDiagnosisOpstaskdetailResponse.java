// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisOpstaskdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisOpstaskdetailResponseBody body;

    public static GetHasDiagnosisOpstaskdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisOpstaskdetailResponse self = new GetHasDiagnosisOpstaskdetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisOpstaskdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisOpstaskdetailResponse setBody(GetHasDiagnosisOpstaskdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisOpstaskdetailResponseBody getBody() {
        return this.body;
    }

}
