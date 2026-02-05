// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetStandAloneReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStandAloneReportsResponseBody body;

    public static GetStandAloneReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStandAloneReportsResponse self = new GetStandAloneReportsResponse();
        return TeaModel.build(map, self);
    }

    public GetStandAloneReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStandAloneReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStandAloneReportsResponse setBody(GetStandAloneReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStandAloneReportsResponseBody getBody() {
        return this.body;
    }

}
