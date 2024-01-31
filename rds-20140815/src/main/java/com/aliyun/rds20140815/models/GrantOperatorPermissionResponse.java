// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GrantOperatorPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantOperatorPermissionResponseBody body;

    public static GrantOperatorPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantOperatorPermissionResponse self = new GrantOperatorPermissionResponse();
        return TeaModel.build(map, self);
    }

    public GrantOperatorPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantOperatorPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantOperatorPermissionResponse setBody(GrantOperatorPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantOperatorPermissionResponseBody getBody() {
        return this.body;
    }

}
