// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyOperatorPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyOperatorPermissionResponseBody body;

    public static ModifyOperatorPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperatorPermissionResponse self = new ModifyOperatorPermissionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOperatorPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOperatorPermissionResponse setBody(ModifyOperatorPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOperatorPermissionResponseBody getBody() {
        return this.body;
    }

}
