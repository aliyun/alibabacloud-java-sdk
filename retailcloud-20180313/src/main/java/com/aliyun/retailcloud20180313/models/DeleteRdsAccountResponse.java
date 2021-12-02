// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteRdsAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRdsAccountResponseBody body;

    public static DeleteRdsAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRdsAccountResponse self = new DeleteRdsAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRdsAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRdsAccountResponse setBody(DeleteRdsAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRdsAccountResponseBody getBody() {
        return this.body;
    }

}
