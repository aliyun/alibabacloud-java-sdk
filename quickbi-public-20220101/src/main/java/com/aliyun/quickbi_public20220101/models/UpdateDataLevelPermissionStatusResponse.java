// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateDataLevelPermissionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataLevelPermissionStatusResponseBody body;

    public static UpdateDataLevelPermissionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataLevelPermissionStatusResponse self = new UpdateDataLevelPermissionStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataLevelPermissionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataLevelPermissionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataLevelPermissionStatusResponse setBody(UpdateDataLevelPermissionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataLevelPermissionStatusResponseBody getBody() {
        return this.body;
    }

}
