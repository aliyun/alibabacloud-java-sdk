// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class MoveAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public MoveAccountResponse setBody(MoveAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveAccountResponseBody getBody() {
        return this.body;
    }

}
