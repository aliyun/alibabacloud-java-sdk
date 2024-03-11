// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisOverallDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeFaultDiagnosisOverallDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFaultDiagnosisOverallDataResponse setBody(DescribeFaultDiagnosisOverallDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaultDiagnosisOverallDataResponseBody getBody() {
        return this.body;
    }

}
