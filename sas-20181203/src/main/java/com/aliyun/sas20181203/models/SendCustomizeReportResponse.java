// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SendCustomizeReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendCustomizeReportResponseBody body;

    public static SendCustomizeReportResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCustomizeReportResponse self = new SendCustomizeReportResponse();
        return TeaModel.build(map, self);
    }

    public SendCustomizeReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCustomizeReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCustomizeReportResponse setBody(SendCustomizeReportResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCustomizeReportResponseBody getBody() {
        return this.body;
    }

}
