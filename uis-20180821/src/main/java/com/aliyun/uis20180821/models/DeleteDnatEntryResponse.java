// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteDnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDnatEntryResponseBody body;

    public static DeleteDnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnatEntryResponse self = new DeleteDnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDnatEntryResponse setBody(DeleteDnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDnatEntryResponseBody getBody() {
        return this.body;
    }

}
