// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteCustomAuthPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomAuthPermissionResponseBody body;

    public static DeleteCustomAuthPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAuthPermissionResponse self = new DeleteCustomAuthPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAuthPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomAuthPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomAuthPermissionResponse setBody(DeleteCustomAuthPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomAuthPermissionResponseBody getBody() {
        return this.body;
    }

}
