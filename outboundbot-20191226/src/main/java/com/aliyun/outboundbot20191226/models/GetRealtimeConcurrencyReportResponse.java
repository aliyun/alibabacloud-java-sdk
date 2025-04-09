// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetRealtimeConcurrencyReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRealtimeConcurrencyReportResponseBody body;

    public static GetRealtimeConcurrencyReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeConcurrencyReportResponse self = new GetRealtimeConcurrencyReportResponse();
        return TeaModel.build(map, self);
    }

    public GetRealtimeConcurrencyReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealtimeConcurrencyReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealtimeConcurrencyReportResponse setBody(GetRealtimeConcurrencyReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeConcurrencyReportResponseBody getBody() {
        return this.body;
    }

}
