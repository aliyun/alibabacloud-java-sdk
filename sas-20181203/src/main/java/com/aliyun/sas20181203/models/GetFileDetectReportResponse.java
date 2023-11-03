// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFileDetectReportResponseBody body;

    public static GetFileDetectReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileDetectReportResponse self = new GetFileDetectReportResponse();
        return TeaModel.build(map, self);
    }

    public GetFileDetectReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileDetectReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileDetectReportResponse setBody(GetFileDetectReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileDetectReportResponseBody getBody() {
        return this.body;
    }

}
