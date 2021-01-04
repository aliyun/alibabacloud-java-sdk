// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DiscribeSmartAccessGatewayDiagnosisReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DiscribeSmartAccessGatewayDiagnosisReportResponseBody body;

    public static DiscribeSmartAccessGatewayDiagnosisReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DiscribeSmartAccessGatewayDiagnosisReportResponse self = new DiscribeSmartAccessGatewayDiagnosisReportResponse();
        return TeaModel.build(map, self);
    }

    public DiscribeSmartAccessGatewayDiagnosisReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiscribeSmartAccessGatewayDiagnosisReportResponse setBody(DiscribeSmartAccessGatewayDiagnosisReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DiscribeSmartAccessGatewayDiagnosisReportResponseBody getBody() {
        return this.body;
    }

}
