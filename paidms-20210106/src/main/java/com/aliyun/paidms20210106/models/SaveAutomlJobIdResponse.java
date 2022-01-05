// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class SaveAutomlJobIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveAutomlJobIdResponseBody body;

    public static SaveAutomlJobIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAutomlJobIdResponse self = new SaveAutomlJobIdResponse();
        return TeaModel.build(map, self);
    }

    public SaveAutomlJobIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAutomlJobIdResponse setBody(SaveAutomlJobIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAutomlJobIdResponseBody getBody() {
        return this.body;
    }

}
