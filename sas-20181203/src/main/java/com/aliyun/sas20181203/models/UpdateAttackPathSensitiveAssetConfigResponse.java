// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateAttackPathSensitiveAssetConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAttackPathSensitiveAssetConfigResponseBody body;

    public static UpdateAttackPathSensitiveAssetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttackPathSensitiveAssetConfigResponse self = new UpdateAttackPathSensitiveAssetConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAttackPathSensitiveAssetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAttackPathSensitiveAssetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAttackPathSensitiveAssetConfigResponse setBody(UpdateAttackPathSensitiveAssetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAttackPathSensitiveAssetConfigResponseBody getBody() {
        return this.body;
    }

}
