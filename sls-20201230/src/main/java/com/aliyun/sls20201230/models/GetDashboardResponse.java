// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetDashboardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Dashboard body;

    public static GetDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDashboardResponse self = new GetDashboardResponse();
        return TeaModel.build(map, self);
    }

    public GetDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDashboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDashboardResponse setBody(Dashboard body) {
        this.body = body;
        return this;
    }
    public Dashboard getBody() {
        return this.body;
    }

}
