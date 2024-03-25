// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class AddCustomAuthPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCustomAuthPermissionResponseBody body;

    public static AddCustomAuthPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomAuthPermissionResponse self = new AddCustomAuthPermissionResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomAuthPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCustomAuthPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCustomAuthPermissionResponse setBody(AddCustomAuthPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCustomAuthPermissionResponseBody getBody() {
        return this.body;
    }

}
