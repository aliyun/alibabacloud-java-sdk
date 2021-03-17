// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteHostAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHostAccountResponseBody body;

    public static DeleteHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostAccountResponse self = new DeleteHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHostAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHostAccountResponse setBody(DeleteHostAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHostAccountResponseBody getBody() {
        return this.body;
    }

}
