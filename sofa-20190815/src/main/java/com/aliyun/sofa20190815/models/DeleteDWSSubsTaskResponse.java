// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDWSSubsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDWSSubsTaskResponseBody body;

    public static DeleteDWSSubsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDWSSubsTaskResponse self = new DeleteDWSSubsTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDWSSubsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDWSSubsTaskResponse setBody(DeleteDWSSubsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDWSSubsTaskResponseBody getBody() {
        return this.body;
    }

}
