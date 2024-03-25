// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UpdateCustomAuthPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomAuthPermissionResponseBody body;

    public static UpdateCustomAuthPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAuthPermissionResponse self = new UpdateCustomAuthPermissionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAuthPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomAuthPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomAuthPermissionResponse setBody(UpdateCustomAuthPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomAuthPermissionResponseBody getBody() {
        return this.body;
    }

}
