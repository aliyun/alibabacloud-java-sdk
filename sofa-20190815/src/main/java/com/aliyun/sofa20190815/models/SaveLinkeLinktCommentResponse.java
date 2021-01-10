// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktCommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeLinktCommentResponseBody body;

    public static SaveLinkeLinktCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktCommentResponse self = new SaveLinkeLinktCommentResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeLinktCommentResponse setBody(SaveLinkeLinktCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeLinktCommentResponseBody getBody() {
        return this.body;
    }

}
