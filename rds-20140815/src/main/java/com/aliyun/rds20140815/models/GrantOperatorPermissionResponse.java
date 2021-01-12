// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GrantOperatorPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantOperatorPermissionResponseBody body;

    public static GrantOperatorPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantOperatorPermissionResponse self = new GrantOperatorPermissionResponse();
        return TeaModel.build(map, self);
    }

    public GrantOperatorPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantOperatorPermissionResponse setBody(GrantOperatorPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantOperatorPermissionResponseBody getBody() {
        return this.body;
    }

}
