// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetScheduledReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScheduledReportsResponseBody body;

    public static GetScheduledReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledReportsResponse self = new GetScheduledReportsResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduledReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduledReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduledReportsResponse setBody(GetScheduledReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduledReportsResponseBody getBody() {
        return this.body;
    }

}
