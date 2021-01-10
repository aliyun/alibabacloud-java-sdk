// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisExecutiondetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisExecutiondetailResponseBody body;

    public static GetHasDiagnosisExecutiondetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisExecutiondetailResponse self = new GetHasDiagnosisExecutiondetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisExecutiondetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisExecutiondetailResponse setBody(GetHasDiagnosisExecutiondetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisExecutiondetailResponseBody getBody() {
        return this.body;
    }

}
