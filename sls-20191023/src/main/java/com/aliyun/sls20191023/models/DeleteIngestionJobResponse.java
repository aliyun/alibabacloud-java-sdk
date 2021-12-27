// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class DeleteIngestionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIngestionJobResponseBody body;

    public static DeleteIngestionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIngestionJobResponse self = new DeleteIngestionJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIngestionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIngestionJobResponse setBody(DeleteIngestionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIngestionJobResponseBody getBody() {
        return this.body;
    }

}
