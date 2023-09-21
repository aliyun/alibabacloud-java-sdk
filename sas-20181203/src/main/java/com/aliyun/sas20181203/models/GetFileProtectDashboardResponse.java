// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectDashboardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFileProtectDashboardResponseBody body;

    public static GetFileProtectDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectDashboardResponse self = new GetFileProtectDashboardResponse();
        return TeaModel.build(map, self);
    }

    public GetFileProtectDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileProtectDashboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileProtectDashboardResponse setBody(GetFileProtectDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileProtectDashboardResponseBody getBody() {
        return this.body;
    }

}
