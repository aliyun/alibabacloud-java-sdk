// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationCustomizeReportChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperationCustomizeReportChartResponseBody body;

    public static OperationCustomizeReportChartResponse build(java.util.Map<String, ?> map) throws Exception {
        OperationCustomizeReportChartResponse self = new OperationCustomizeReportChartResponse();
        return TeaModel.build(map, self);
    }

    public OperationCustomizeReportChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperationCustomizeReportChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperationCustomizeReportChartResponse setBody(OperationCustomizeReportChartResponseBody body) {
        this.body = body;
        return this;
    }
    public OperationCustomizeReportChartResponseBody getBody() {
        return this.body;
    }

}
