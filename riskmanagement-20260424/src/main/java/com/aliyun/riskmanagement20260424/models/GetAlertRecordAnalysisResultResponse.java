// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAlertRecordAnalysisResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlertRecordAnalysisResultResponseBody body;

    public static GetAlertRecordAnalysisResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRecordAnalysisResultResponse self = new GetAlertRecordAnalysisResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertRecordAnalysisResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertRecordAnalysisResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertRecordAnalysisResultResponse setBody(GetAlertRecordAnalysisResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertRecordAnalysisResultResponseBody getBody() {
        return this.body;
    }

}
