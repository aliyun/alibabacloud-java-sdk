// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRecordsResponseBody body;

    public static DeleteRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordsResponse self = new DeleteRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecordsResponse setBody(DeleteRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecordsResponseBody getBody() {
        return this.body;
    }

}
