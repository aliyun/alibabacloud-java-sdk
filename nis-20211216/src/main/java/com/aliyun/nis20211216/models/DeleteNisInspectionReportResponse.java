// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNisInspectionReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNisInspectionReportResponseBody body;

    public static DeleteNisInspectionReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNisInspectionReportResponse self = new DeleteNisInspectionReportResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNisInspectionReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNisInspectionReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNisInspectionReportResponse setBody(DeleteNisInspectionReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNisInspectionReportResponseBody getBody() {
        return this.body;
    }

}
