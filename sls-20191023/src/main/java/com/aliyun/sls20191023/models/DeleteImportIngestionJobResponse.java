// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class DeleteImportIngestionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteImportIngestionJobResponseBody body;

    public static DeleteImportIngestionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImportIngestionJobResponse self = new DeleteImportIngestionJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImportIngestionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImportIngestionJobResponse setBody(DeleteImportIngestionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImportIngestionJobResponseBody getBody() {
        return this.body;
    }

}
