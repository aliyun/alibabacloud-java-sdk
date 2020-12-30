// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class CreateDatasetRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDatasetRecordResponseBody body;

    public static CreateDatasetRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRecordResponse self = new CreateDatasetRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasetRecordResponse setBody(CreateDatasetRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasetRecordResponseBody getBody() {
        return this.body;
    }

}
