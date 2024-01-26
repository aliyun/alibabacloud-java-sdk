// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class ReportTestSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportTestSampleResponseBody body;

    public static ReportTestSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportTestSampleResponse self = new ReportTestSampleResponse();
        return TeaModel.build(map, self);
    }

    public ReportTestSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportTestSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportTestSampleResponse setBody(ReportTestSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportTestSampleResponseBody getBody() {
        return this.body;
    }

}
