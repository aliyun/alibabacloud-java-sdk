// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktSearchusersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktSearchusersResponseBody body;

    public static ExecLinkeLinktSearchusersResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktSearchusersResponse self = new ExecLinkeLinktSearchusersResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktSearchusersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktSearchusersResponse setBody(ExecLinkeLinktSearchusersResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktSearchusersResponseBody getBody() {
        return this.body;
    }

}
