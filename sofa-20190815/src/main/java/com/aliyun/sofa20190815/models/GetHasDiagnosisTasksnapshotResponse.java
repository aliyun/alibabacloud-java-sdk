// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisTasksnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisTasksnapshotResponseBody body;

    public static GetHasDiagnosisTasksnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisTasksnapshotResponse self = new GetHasDiagnosisTasksnapshotResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisTasksnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisTasksnapshotResponse setBody(GetHasDiagnosisTasksnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisTasksnapshotResponseBody getBody() {
        return this.body;
    }

}
