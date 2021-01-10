// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSSecretImagepullResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSSecretImagepullResponseBody body;

    public static DeleteAKSSecretImagepullResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSSecretImagepullResponse self = new DeleteAKSSecretImagepullResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSSecretImagepullResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSSecretImagepullResponse setBody(DeleteAKSSecretImagepullResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSSecretImagepullResponseBody getBody() {
        return this.body;
    }

}
