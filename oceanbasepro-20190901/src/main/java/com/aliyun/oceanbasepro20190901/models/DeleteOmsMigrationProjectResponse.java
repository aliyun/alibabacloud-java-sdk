// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOmsMigrationProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOmsMigrationProjectResponseBody body;

    public static DeleteOmsMigrationProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOmsMigrationProjectResponse self = new DeleteOmsMigrationProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOmsMigrationProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOmsMigrationProjectResponse setBody(DeleteOmsMigrationProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOmsMigrationProjectResponseBody getBody() {
        return this.body;
    }

}
