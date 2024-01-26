// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190522.models;

import com.aliyun.tea.*;

public class GetAliwareReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAliwareReportResponseBody body;

    public static GetAliwareReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAliwareReportResponse self = new GetAliwareReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAliwareReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAliwareReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAliwareReportResponse setBody(GetAliwareReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAliwareReportResponseBody getBody() {
        return this.body;
    }

}
