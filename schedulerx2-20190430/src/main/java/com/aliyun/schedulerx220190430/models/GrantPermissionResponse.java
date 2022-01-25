// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GrantPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantPermissionResponseBody body;

    public static GrantPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantPermissionResponse self = new GrantPermissionResponse();
        return TeaModel.build(map, self);
    }

    public GrantPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantPermissionResponse setBody(GrantPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantPermissionResponseBody getBody() {
        return this.body;
    }

}
