// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetScriptTrendingReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScriptTrendingReportResponseBody body;

    public static GetScriptTrendingReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScriptTrendingReportResponse self = new GetScriptTrendingReportResponse();
        return TeaModel.build(map, self);
    }

    public GetScriptTrendingReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScriptTrendingReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScriptTrendingReportResponse setBody(GetScriptTrendingReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScriptTrendingReportResponseBody getBody() {
        return this.body;
    }

}
