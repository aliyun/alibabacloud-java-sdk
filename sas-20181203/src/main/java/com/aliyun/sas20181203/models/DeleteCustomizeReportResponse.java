// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCustomizeReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomizeReportResponseBody body;

    public static DeleteCustomizeReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizeReportResponse self = new DeleteCustomizeReportResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizeReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomizeReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomizeReportResponse setBody(DeleteCustomizeReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomizeReportResponseBody getBody() {
        return this.body;
    }

}
