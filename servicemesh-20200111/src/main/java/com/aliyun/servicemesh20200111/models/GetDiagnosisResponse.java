// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDiagnosisResponseBody body;

    public static GetDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisResponse self = new GetDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiagnosisResponse setBody(GetDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiagnosisResponseBody getBody() {
        return this.body;
    }

}
