// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateVideoSummaryTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVideoSummaryTaskResponseBody body;

    public static CreateVideoSummaryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoSummaryTaskResponse self = new CreateVideoSummaryTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoSummaryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoSummaryTaskResponse setBody(CreateVideoSummaryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoSummaryTaskResponseBody getBody() {
        return this.body;
    }

}
