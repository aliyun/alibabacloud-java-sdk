// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteMarkerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMarkerResponseBody body;

    public static DeleteMarkerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMarkerResponse self = new DeleteMarkerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMarkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMarkerResponse setBody(DeleteMarkerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMarkerResponseBody getBody() {
        return this.body;
    }

}
