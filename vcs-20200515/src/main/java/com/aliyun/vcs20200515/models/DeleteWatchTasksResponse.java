// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteWatchTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWatchTasksResponseBody body;

    public static DeleteWatchTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatchTasksResponse self = new DeleteWatchTasksResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWatchTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWatchTasksResponse setBody(DeleteWatchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWatchTasksResponseBody getBody() {
        return this.body;
    }

}
