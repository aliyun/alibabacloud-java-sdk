// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckAccountNameAvailableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckAccountNameAvailableResponseBody body;

    public static CheckAccountNameAvailableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountNameAvailableResponse self = new CheckAccountNameAvailableResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccountNameAvailableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAccountNameAvailableResponse setBody(CheckAccountNameAvailableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAccountNameAvailableResponseBody getBody() {
        return this.body;
    }

}
