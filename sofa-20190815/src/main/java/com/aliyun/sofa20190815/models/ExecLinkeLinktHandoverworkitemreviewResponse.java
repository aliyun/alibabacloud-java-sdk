// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktHandoverworkitemreviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktHandoverworkitemreviewResponseBody body;

    public static ExecLinkeLinktHandoverworkitemreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktHandoverworkitemreviewResponse self = new ExecLinkeLinktHandoverworkitemreviewResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktHandoverworkitemreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktHandoverworkitemreviewResponse setBody(ExecLinkeLinktHandoverworkitemreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktHandoverworkitemreviewResponseBody getBody() {
        return this.body;
    }

}
