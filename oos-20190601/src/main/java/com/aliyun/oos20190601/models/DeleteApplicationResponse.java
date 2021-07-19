// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApplicationResponseBody body;

    public static DeleteApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationResponse self = new DeleteApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationResponse setBody(DeleteApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationResponseBody getBody() {
        return this.body;
    }

}
