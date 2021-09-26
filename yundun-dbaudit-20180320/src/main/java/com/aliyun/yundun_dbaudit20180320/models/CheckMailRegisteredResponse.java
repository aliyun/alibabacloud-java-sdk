// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CheckMailRegisteredResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckMailRegisteredResponseBody body;

    public static CheckMailRegisteredResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMailRegisteredResponse self = new CheckMailRegisteredResponse();
        return TeaModel.build(map, self);
    }

    public CheckMailRegisteredResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMailRegisteredResponse setBody(CheckMailRegisteredResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMailRegisteredResponseBody getBody() {
        return this.body;
    }

}
