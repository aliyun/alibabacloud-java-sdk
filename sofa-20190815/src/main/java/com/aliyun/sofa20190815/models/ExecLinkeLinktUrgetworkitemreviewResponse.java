// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktUrgetworkitemreviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktUrgetworkitemreviewResponseBody body;

    public static ExecLinkeLinktUrgetworkitemreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktUrgetworkitemreviewResponse self = new ExecLinkeLinktUrgetworkitemreviewResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktUrgetworkitemreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktUrgetworkitemreviewResponse setBody(ExecLinkeLinktUrgetworkitemreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktUrgetworkitemreviewResponseBody getBody() {
        return this.body;
    }

}
