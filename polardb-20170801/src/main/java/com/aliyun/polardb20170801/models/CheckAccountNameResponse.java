// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckAccountNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckAccountNameResponseBody body;

    public static CheckAccountNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountNameResponse self = new CheckAccountNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccountNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAccountNameResponse setBody(CheckAccountNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAccountNameResponseBody getBody() {
        return this.body;
    }

}
