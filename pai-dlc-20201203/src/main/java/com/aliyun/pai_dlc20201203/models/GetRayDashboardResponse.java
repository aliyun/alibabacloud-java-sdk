// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRayDashboardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRayDashboardResponseBody body;

    public static GetRayDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRayDashboardResponse self = new GetRayDashboardResponse();
        return TeaModel.build(map, self);
    }

    public GetRayDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRayDashboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRayDashboardResponse setBody(GetRayDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRayDashboardResponseBody getBody() {
        return this.body;
    }

}
