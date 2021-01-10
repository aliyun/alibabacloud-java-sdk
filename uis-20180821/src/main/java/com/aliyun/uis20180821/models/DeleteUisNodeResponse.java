// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteUisNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUisNodeResponseBody body;

    public static DeleteUisNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisNodeResponse self = new DeleteUisNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUisNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUisNodeResponse setBody(DeleteUisNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUisNodeResponseBody getBody() {
        return this.body;
    }

}
