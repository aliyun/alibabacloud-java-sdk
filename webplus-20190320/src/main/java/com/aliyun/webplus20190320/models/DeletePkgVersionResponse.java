// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeletePkgVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePkgVersionResponseBody body;

    public static DeletePkgVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePkgVersionResponse self = new DeletePkgVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeletePkgVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePkgVersionResponse setBody(DeletePkgVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePkgVersionResponseBody getBody() {
        return this.body;
    }

}
