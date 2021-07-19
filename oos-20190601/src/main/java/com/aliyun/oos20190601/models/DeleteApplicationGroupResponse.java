// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteApplicationGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApplicationGroupResponseBody body;

    public static DeleteApplicationGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationGroupResponse self = new DeleteApplicationGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationGroupResponse setBody(DeleteApplicationGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationGroupResponseBody getBody() {
        return this.body;
    }

}
