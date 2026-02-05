// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetInspectionReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInspectionReportResponseBody body;

    public static GetInspectionReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionReportResponse self = new GetInspectionReportResponse();
        return TeaModel.build(map, self);
    }

    public GetInspectionReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInspectionReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInspectionReportResponse setBody(GetInspectionReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInspectionReportResponseBody getBody() {
        return this.body;
    }

}
