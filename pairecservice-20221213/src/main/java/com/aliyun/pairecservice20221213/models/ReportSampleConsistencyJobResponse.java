// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ReportSampleConsistencyJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportSampleConsistencyJobResponseBody body;

    public static ReportSampleConsistencyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportSampleConsistencyJobResponse self = new ReportSampleConsistencyJobResponse();
        return TeaModel.build(map, self);
    }

    public ReportSampleConsistencyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportSampleConsistencyJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportSampleConsistencyJobResponse setBody(ReportSampleConsistencyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportSampleConsistencyJobResponseBody getBody() {
        return this.body;
    }

}
