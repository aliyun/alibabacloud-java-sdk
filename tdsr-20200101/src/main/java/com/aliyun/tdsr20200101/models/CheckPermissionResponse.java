// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CheckPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckPermissionResponse setBody(CheckPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckPermissionResponseBody getBody() {
        return this.body;
    }

}
