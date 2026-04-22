// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListHistoricalScriptReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHistoricalScriptReportResponseBody body;

    public static ListHistoricalScriptReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalScriptReportResponse self = new ListHistoricalScriptReportResponse();
        return TeaModel.build(map, self);
    }

    public ListHistoricalScriptReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHistoricalScriptReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHistoricalScriptReportResponse setBody(ListHistoricalScriptReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHistoricalScriptReportResponseBody getBody() {
        return this.body;
    }

}
