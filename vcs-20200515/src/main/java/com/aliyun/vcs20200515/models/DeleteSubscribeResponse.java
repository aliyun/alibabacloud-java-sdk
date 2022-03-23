// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSubscribeResponseBody body;

    public static DeleteSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscribeResponse self = new DeleteSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubscribeResponse setBody(DeleteSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubscribeResponseBody getBody() {
        return this.body;
    }

}
