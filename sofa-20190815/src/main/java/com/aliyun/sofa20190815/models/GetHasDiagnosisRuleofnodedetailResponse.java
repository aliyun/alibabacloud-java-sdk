// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisRuleofnodedetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisRuleofnodedetailResponseBody body;

    public static GetHasDiagnosisRuleofnodedetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisRuleofnodedetailResponse self = new GetHasDiagnosisRuleofnodedetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisRuleofnodedetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisRuleofnodedetailResponse setBody(GetHasDiagnosisRuleofnodedetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisRuleofnodedetailResponseBody getBody() {
        return this.body;
    }

}
