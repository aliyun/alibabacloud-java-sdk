// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CheckUserPropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUserPropertyResponseBody body;

    public static CheckUserPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserPropertyResponse self = new CheckUserPropertyResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserPropertyResponse setBody(CheckUserPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserPropertyResponseBody getBody() {
        return this.body;
    }

}
