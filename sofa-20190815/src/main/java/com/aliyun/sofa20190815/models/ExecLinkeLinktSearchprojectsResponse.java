// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktSearchprojectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktSearchprojectsResponseBody body;

    public static ExecLinkeLinktSearchprojectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktSearchprojectsResponse self = new ExecLinkeLinktSearchprojectsResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktSearchprojectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktSearchprojectsResponse setBody(ExecLinkeLinktSearchprojectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktSearchprojectsResponseBody getBody() {
        return this.body;
    }

}
