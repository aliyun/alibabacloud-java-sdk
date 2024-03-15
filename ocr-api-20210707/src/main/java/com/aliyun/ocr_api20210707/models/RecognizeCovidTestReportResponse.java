// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCovidTestReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeCovidTestReportResponseBody body;

    public static RecognizeCovidTestReportResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCovidTestReportResponse self = new RecognizeCovidTestReportResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeCovidTestReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeCovidTestReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeCovidTestReportResponse setBody(RecognizeCovidTestReportResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeCovidTestReportResponseBody getBody() {
        return this.body;
    }

}
