// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFaultDiagnosisUserDetailResponseBody body;

    public static DescribeFaultDiagnosisUserDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisUserDetailResponse self = new DescribeFaultDiagnosisUserDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisUserDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaultDiagnosisUserDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFaultDiagnosisUserDetailResponse setBody(DescribeFaultDiagnosisUserDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaultDiagnosisUserDetailResponseBody getBody() {
        return this.body;
    }

}
