// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetTenantCheckAvailableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTenantCheckAvailableResponseBody body;

    public static GetTenantCheckAvailableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTenantCheckAvailableResponse self = new GetTenantCheckAvailableResponse();
        return TeaModel.build(map, self);
    }

    public GetTenantCheckAvailableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTenantCheckAvailableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTenantCheckAvailableResponse setBody(GetTenantCheckAvailableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTenantCheckAvailableResponseBody getBody() {
        return this.body;
    }

}
