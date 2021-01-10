// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisNodeResponseBody body;

    public static GetHasDiagnosisNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisNodeResponse self = new GetHasDiagnosisNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisNodeResponse setBody(GetHasDiagnosisNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisNodeResponseBody getBody() {
        return this.body;
    }

}
