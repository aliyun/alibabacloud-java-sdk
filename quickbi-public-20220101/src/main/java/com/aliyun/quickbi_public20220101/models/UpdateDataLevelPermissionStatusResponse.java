// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateDataLevelPermissionStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateDataLevelPermissionStatusResponse setBody(UpdateDataLevelPermissionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataLevelPermissionStatusResponseBody getBody() {
        return this.body;
    }

}
