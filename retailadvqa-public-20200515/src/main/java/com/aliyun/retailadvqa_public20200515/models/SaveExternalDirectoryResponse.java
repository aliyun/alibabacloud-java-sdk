// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SaveExternalDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveExternalDirectoryResponseBody body;

    public static SaveExternalDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveExternalDirectoryResponse self = new SaveExternalDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public SaveExternalDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveExternalDirectoryResponse setBody(SaveExternalDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveExternalDirectoryResponseBody getBody() {
        return this.body;
    }

}
