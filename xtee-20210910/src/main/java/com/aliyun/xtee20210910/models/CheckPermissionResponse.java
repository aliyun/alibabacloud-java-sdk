// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckPermissionResponseBody body;

    public static CheckPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckPermissionResponse self = new CheckPermissionResponse();
        return TeaModel.build(map, self);
    }

    public CheckPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckPermissionResponse setBody(CheckPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckPermissionResponseBody getBody() {
        return this.body;
    }

}
