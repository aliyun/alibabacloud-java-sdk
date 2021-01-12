// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAccountResponseBody body;

    public static DeleteAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountResponse self = new DeleteAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccountResponse setBody(DeleteAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccountResponseBody getBody() {
        return this.body;
    }

}
