// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class StartQuotaUtilizationReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartQuotaUtilizationReportResponseBody body;

    public static StartQuotaUtilizationReportResponse build(java.util.Map<String, ?> map) throws Exception {
        StartQuotaUtilizationReportResponse self = new StartQuotaUtilizationReportResponse();
        return TeaModel.build(map, self);
    }

    public StartQuotaUtilizationReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartQuotaUtilizationReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartQuotaUtilizationReportResponse setBody(StartQuotaUtilizationReportResponseBody body) {
        this.body = body;
        return this;
    }
    public StartQuotaUtilizationReportResponseBody getBody() {
        return this.body;
    }

}
