// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisOverallDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFaultDiagnosisOverallDataResponseBody body;

    public static DescribeFaultDiagnosisOverallDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisOverallDataResponse self = new DescribeFaultDiagnosisOverallDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisOverallDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaultDiagnosisOverallDataResponse setBody(DescribeFaultDiagnosisOverallDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaultDiagnosisOverallDataResponseBody getBody() {
        return this.body;
    }

}
