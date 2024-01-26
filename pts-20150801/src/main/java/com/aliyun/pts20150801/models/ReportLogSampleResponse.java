// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class ReportLogSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportLogSampleResponseBody body;

    public static ReportLogSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportLogSampleResponse self = new ReportLogSampleResponse();
        return TeaModel.build(map, self);
    }

    public ReportLogSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportLogSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportLogSampleResponse setBody(ReportLogSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportLogSampleResponseBody getBody() {
        return this.body;
    }

}
