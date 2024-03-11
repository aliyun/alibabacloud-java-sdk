// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisFactorDistributionStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFaultDiagnosisFactorDistributionStatResponseBody body;

    public static DescribeFaultDiagnosisFactorDistributionStatResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisFactorDistributionStatResponse self = new DescribeFaultDiagnosisFactorDistributionStatResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisFactorDistributionStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaultDiagnosisFactorDistributionStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFaultDiagnosisFactorDistributionStatResponse setBody(DescribeFaultDiagnosisFactorDistributionStatResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaultDiagnosisFactorDistributionStatResponseBody getBody() {
        return this.body;
    }

}
