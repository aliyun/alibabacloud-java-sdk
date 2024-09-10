// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportCustomizeReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportCustomizeReportResponseBody body;

    public static ExportCustomizeReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportCustomizeReportResponse self = new ExportCustomizeReportResponse();
        return TeaModel.build(map, self);
    }

    public ExportCustomizeReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportCustomizeReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportCustomizeReportResponse setBody(ExportCustomizeReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportCustomizeReportResponseBody getBody() {
        return this.body;
    }

}
