// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckResourcepackSlrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckResourcepackSlrResponseBody body;

    public static CheckResourcepackSlrResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResourcepackSlrResponse self = new CheckResourcepackSlrResponse();
        return TeaModel.build(map, self);
    }

    public CheckResourcepackSlrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckResourcepackSlrResponse setBody(CheckResourcepackSlrResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckResourcepackSlrResponseBody getBody() {
        return this.body;
    }

}
