// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteRbacPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRbacPermissionResponseBody body;

    public static DeleteRbacPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRbacPermissionResponse self = new DeleteRbacPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRbacPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRbacPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRbacPermissionResponse setBody(DeleteRbacPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRbacPermissionResponseBody getBody() {
        return this.body;
    }

}
