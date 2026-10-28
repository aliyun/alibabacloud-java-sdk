// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaUtilizationReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQuotaUtilizationReportResponseBody body;

    public static ListQuotaUtilizationReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaUtilizationReportResponse self = new ListQuotaUtilizationReportResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotaUtilizationReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotaUtilizationReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuotaUtilizationReportResponse setBody(ListQuotaUtilizationReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotaUtilizationReportResponseBody getBody() {
        return this.body;
    }

}
