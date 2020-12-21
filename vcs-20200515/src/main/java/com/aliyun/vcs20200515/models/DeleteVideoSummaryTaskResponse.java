// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteVideoSummaryTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVideoSummaryTaskResponseBody body;

    public static DeleteVideoSummaryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoSummaryTaskResponse self = new DeleteVideoSummaryTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVideoSummaryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVideoSummaryTaskResponse setBody(DeleteVideoSummaryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVideoSummaryTaskResponseBody getBody() {
        return this.body;
    }

}
