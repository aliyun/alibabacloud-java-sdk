// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterBaseLineListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpaClusterBaseLineListResponseBody body;

    public static GetOpaClusterBaseLineListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpaClusterBaseLineListResponse self = new GetOpaClusterBaseLineListResponse();
        return TeaModel.build(map, self);
    }

    public GetOpaClusterBaseLineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpaClusterBaseLineListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpaClusterBaseLineListResponse setBody(GetOpaClusterBaseLineListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpaClusterBaseLineListResponseBody getBody() {
        return this.body;
    }

}
