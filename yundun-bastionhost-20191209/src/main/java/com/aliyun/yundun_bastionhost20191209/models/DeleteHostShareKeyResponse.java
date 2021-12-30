// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteHostShareKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHostShareKeyResponseBody body;

    public static DeleteHostShareKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostShareKeyResponse self = new DeleteHostShareKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHostShareKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHostShareKeyResponse setBody(DeleteHostShareKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHostShareKeyResponseBody getBody() {
        return this.body;
    }

}
