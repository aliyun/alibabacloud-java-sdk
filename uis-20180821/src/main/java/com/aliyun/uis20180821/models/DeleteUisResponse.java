// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteUisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUisResponseBody body;

    public static DeleteUisResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisResponse self = new DeleteUisResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUisResponse setBody(DeleteUisResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUisResponseBody getBody() {
        return this.body;
    }

}
