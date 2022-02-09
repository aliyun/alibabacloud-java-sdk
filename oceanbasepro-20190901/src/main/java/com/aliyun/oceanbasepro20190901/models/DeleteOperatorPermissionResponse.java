// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOperatorPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOperatorPermissionResponseBody body;

    public static DeleteOperatorPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOperatorPermissionResponse self = new DeleteOperatorPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOperatorPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOperatorPermissionResponse setBody(DeleteOperatorPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOperatorPermissionResponseBody getBody() {
        return this.body;
    }

}
