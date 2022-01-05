// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class SaveAutomlModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveAutomlModelResponseBody body;

    public static SaveAutomlModelResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAutomlModelResponse self = new SaveAutomlModelResponse();
        return TeaModel.build(map, self);
    }

    public SaveAutomlModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAutomlModelResponse setBody(SaveAutomlModelResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAutomlModelResponseBody getBody() {
        return this.body;
    }

}
