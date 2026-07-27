// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetLakebaseTenantTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLakebaseTenantTokenResponseBody body;

    public static GetLakebaseTenantTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLakebaseTenantTokenResponse self = new GetLakebaseTenantTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetLakebaseTenantTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLakebaseTenantTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLakebaseTenantTokenResponse setBody(GetLakebaseTenantTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLakebaseTenantTokenResponseBody getBody() {
        return this.body;
    }

}
