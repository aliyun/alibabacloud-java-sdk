// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCustomizeReportStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomizeReportStatusResponseBody body;

    public static UpdateCustomizeReportStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomizeReportStatusResponse self = new UpdateCustomizeReportStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomizeReportStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomizeReportStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomizeReportStatusResponse setBody(UpdateCustomizeReportStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomizeReportStatusResponseBody getBody() {
        return this.body;
    }

}
