// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListHistoricalInstanceReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHistoricalInstanceReportResponseBody body;

    public static ListHistoricalInstanceReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalInstanceReportResponse self = new ListHistoricalInstanceReportResponse();
        return TeaModel.build(map, self);
    }

    public ListHistoricalInstanceReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHistoricalInstanceReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHistoricalInstanceReportResponse setBody(ListHistoricalInstanceReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHistoricalInstanceReportResponseBody getBody() {
        return this.body;
    }

}
