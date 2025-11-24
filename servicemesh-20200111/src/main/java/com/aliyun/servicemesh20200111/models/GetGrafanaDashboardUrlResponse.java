// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetGrafanaDashboardUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGrafanaDashboardUrlResponseBody body;

    public static GetGrafanaDashboardUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGrafanaDashboardUrlResponse self = new GetGrafanaDashboardUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetGrafanaDashboardUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGrafanaDashboardUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGrafanaDashboardUrlResponse setBody(GetGrafanaDashboardUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGrafanaDashboardUrlResponseBody getBody() {
        return this.body;
    }

}
