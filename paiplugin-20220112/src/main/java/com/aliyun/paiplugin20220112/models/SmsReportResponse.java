// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SmsReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SmsReportResponseBody body;

    public static SmsReportResponse build(java.util.Map<String, ?> map) throws Exception {
        SmsReportResponse self = new SmsReportResponse();
        return TeaModel.build(map, self);
    }

    public SmsReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmsReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SmsReportResponse setBody(SmsReportResponseBody body) {
        this.body = body;
        return this;
    }
    public SmsReportResponseBody getBody() {
        return this.body;
    }

}
