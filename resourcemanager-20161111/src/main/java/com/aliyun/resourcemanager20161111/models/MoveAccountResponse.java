// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class MoveAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MoveAccountResponseBody body;

    public static MoveAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveAccountResponse self = new MoveAccountResponse();
        return TeaModel.build(map, self);
    }

    public MoveAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveAccountResponse setBody(MoveAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveAccountResponseBody getBody() {
        return this.body;
    }

}
