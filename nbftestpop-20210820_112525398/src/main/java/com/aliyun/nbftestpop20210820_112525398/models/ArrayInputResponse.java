// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210820_112525398.models;

import com.aliyun.tea.*;

public class ArrayInputResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ArrayInputResponseBody body;

    public static ArrayInputResponse build(java.util.Map<String, ?> map) throws Exception {
        ArrayInputResponse self = new ArrayInputResponse();
        return TeaModel.build(map, self);
    }

    public ArrayInputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ArrayInputResponse setBody(ArrayInputResponseBody body) {
        this.body = body;
        return this;
    }
    public ArrayInputResponseBody getBody() {
        return this.body;
    }

}
