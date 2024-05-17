// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOverviewResponseBody body;

    public static GetOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOverviewResponse self = new GetOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOverviewResponse setBody(GetOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOverviewResponseBody getBody() {
        return this.body;
    }

}
