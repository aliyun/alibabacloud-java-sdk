// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class DeleteRowLevelPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRowLevelPermissionResponseBody body;

    public static DeleteRowLevelPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRowLevelPermissionResponse self = new DeleteRowLevelPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRowLevelPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRowLevelPermissionResponse setBody(DeleteRowLevelPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRowLevelPermissionResponseBody getBody() {
        return this.body;
    }

}
