// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteForwardEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteForwardEntryResponseBody body;

    public static DeleteForwardEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardEntryResponse self = new DeleteForwardEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteForwardEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteForwardEntryResponse setBody(DeleteForwardEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteForwardEntryResponseBody getBody() {
        return this.body;
    }

}
