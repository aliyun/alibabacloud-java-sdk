// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAccountResponseBody body;

    public static UpdateAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountResponse self = new UpdateAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccountResponse setBody(UpdateAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccountResponseBody getBody() {
        return this.body;
    }

}
