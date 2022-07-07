// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetModelReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelReportResponseBody body;

    public static GetModelReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelReportResponse self = new GetModelReportResponse();
        return TeaModel.build(map, self);
    }

    public GetModelReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelReportResponse setBody(GetModelReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelReportResponseBody getBody() {
        return this.body;
    }

}
