// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectClientRuleDashboardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileProtectClientRuleDashboardResponseBody body;

    public static GetFileProtectClientRuleDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectClientRuleDashboardResponse self = new GetFileProtectClientRuleDashboardResponse();
        return TeaModel.build(map, self);
    }

    public GetFileProtectClientRuleDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileProtectClientRuleDashboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileProtectClientRuleDashboardResponse setBody(GetFileProtectClientRuleDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileProtectClientRuleDashboardResponseBody getBody() {
        return this.body;
    }

}
