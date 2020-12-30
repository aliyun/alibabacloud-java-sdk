// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class DeleteModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteModelResponseBody body;

    public static DeleteModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelResponse self = new DeleteModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelResponse setBody(DeleteModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelResponseBody getBody() {
        return this.body;
    }

}
