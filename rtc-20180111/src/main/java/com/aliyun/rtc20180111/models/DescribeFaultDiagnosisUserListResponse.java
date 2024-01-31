// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFaultDiagnosisUserListResponseBody body;

    public static DescribeFaultDiagnosisUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisUserListResponse self = new DescribeFaultDiagnosisUserListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaultDiagnosisUserListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFaultDiagnosisUserListResponse setBody(DescribeFaultDiagnosisUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaultDiagnosisUserListResponseBody getBody() {
        return this.body;
    }

}
