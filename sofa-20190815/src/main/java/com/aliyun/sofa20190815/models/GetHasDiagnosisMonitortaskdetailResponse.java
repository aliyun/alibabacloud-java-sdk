// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisMonitortaskdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisMonitortaskdetailResponseBody body;

    public static GetHasDiagnosisMonitortaskdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisMonitortaskdetailResponse self = new GetHasDiagnosisMonitortaskdetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisMonitortaskdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisMonitortaskdetailResponse setBody(GetHasDiagnosisMonitortaskdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisMonitortaskdetailResponseBody getBody() {
        return this.body;
    }

}
