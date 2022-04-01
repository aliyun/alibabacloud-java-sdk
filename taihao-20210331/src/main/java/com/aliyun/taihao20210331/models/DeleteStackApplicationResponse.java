// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteStackApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteStackApplicationResponseBody body;

    public static DeleteStackApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackApplicationResponse self = new DeleteStackApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStackApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStackApplicationResponse setBody(DeleteStackApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStackApplicationResponseBody getBody() {
        return this.body;
    }

}
