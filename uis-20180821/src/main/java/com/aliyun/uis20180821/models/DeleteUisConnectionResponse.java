// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteUisConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUisConnectionResponseBody body;

    public static DeleteUisConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisConnectionResponse self = new DeleteUisConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUisConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUisConnectionResponse setBody(DeleteUisConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUisConnectionResponseBody getBody() {
        return this.body;
    }

}
