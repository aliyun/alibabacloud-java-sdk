// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceInspectionReportResponseBody body;

    public static GetInstanceInspectionReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInspectionReportResponse self = new GetInstanceInspectionReportResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceInspectionReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceInspectionReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceInspectionReportResponse setBody(GetInstanceInspectionReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceInspectionReportResponseBody getBody() {
        return this.body;
    }

}
