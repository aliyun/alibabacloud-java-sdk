// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAttackPathSensitiveAssetConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAttackPathSensitiveAssetConfigResponseBody body;

    public static DeleteAttackPathSensitiveAssetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttackPathSensitiveAssetConfigResponse self = new DeleteAttackPathSensitiveAssetConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAttackPathSensitiveAssetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAttackPathSensitiveAssetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAttackPathSensitiveAssetConfigResponse setBody(DeleteAttackPathSensitiveAssetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAttackPathSensitiveAssetConfigResponseBody getBody() {
        return this.body;
    }

}
