// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGroupIdResponseBody body;

    public static DeleteGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupIdResponse self = new DeleteGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupIdResponse setBody(DeleteGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupIdResponseBody getBody() {
        return this.body;
    }

}
