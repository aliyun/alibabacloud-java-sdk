// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckInstanceExistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckInstanceExistResponseBody body;

    public static CheckInstanceExistResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceExistResponse self = new CheckInstanceExistResponse();
        return TeaModel.build(map, self);
    }

    public CheckInstanceExistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInstanceExistResponse setBody(CheckInstanceExistResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInstanceExistResponseBody getBody() {
        return this.body;
    }

}
