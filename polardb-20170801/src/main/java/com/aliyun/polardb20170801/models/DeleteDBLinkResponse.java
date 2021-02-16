// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDBLinkResponseBody body;

    public static DeleteDBLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBLinkResponse self = new DeleteDBLinkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBLinkResponse setBody(DeleteDBLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBLinkResponseBody getBody() {
        return this.body;
    }

}
