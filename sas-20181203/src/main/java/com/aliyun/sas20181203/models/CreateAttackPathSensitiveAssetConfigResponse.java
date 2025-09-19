// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAttackPathSensitiveAssetConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAttackPathSensitiveAssetConfigResponseBody body;

    public static CreateAttackPathSensitiveAssetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAttackPathSensitiveAssetConfigResponse self = new CreateAttackPathSensitiveAssetConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAttackPathSensitiveAssetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAttackPathSensitiveAssetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAttackPathSensitiveAssetConfigResponse setBody(CreateAttackPathSensitiveAssetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAttackPathSensitiveAssetConfigResponseBody getBody() {
        return this.body;
    }

}
