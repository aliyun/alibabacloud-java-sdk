// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CheckAppResourcePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAppResourcePermissionResponseBody body;

    public static CheckAppResourcePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAppResourcePermissionResponse self = new CheckAppResourcePermissionResponse();
        return TeaModel.build(map, self);
    }

    public CheckAppResourcePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAppResourcePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAppResourcePermissionResponse setBody(CheckAppResourcePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAppResourcePermissionResponseBody getBody() {
        return this.body;
    }

}
