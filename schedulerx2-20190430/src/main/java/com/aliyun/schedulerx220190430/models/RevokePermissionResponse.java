// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class RevokePermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokePermissionResponseBody body;

    public static RevokePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokePermissionResponse self = new RevokePermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokePermissionResponse setBody(RevokePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokePermissionResponseBody getBody() {
        return this.body;
    }

}
