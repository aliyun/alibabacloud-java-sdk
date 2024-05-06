// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class MoveAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
