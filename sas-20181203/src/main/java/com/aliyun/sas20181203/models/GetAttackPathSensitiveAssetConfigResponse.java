// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackPathSensitiveAssetConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAttackPathSensitiveAssetConfigResponseBody body;

    public static GetAttackPathSensitiveAssetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttackPathSensitiveAssetConfigResponse self = new GetAttackPathSensitiveAssetConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAttackPathSensitiveAssetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttackPathSensitiveAssetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAttackPathSensitiveAssetConfigResponse setBody(GetAttackPathSensitiveAssetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttackPathSensitiveAssetConfigResponseBody getBody() {
        return this.body;
    }

}
