// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinkaHealthcheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinkaHealthcheckResponseBody body;

    public static ExecLinkeLinkaHealthcheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinkaHealthcheckResponse self = new ExecLinkeLinkaHealthcheckResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinkaHealthcheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinkaHealthcheckResponse setBody(ExecLinkeLinkaHealthcheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinkaHealthcheckResponseBody getBody() {
        return this.body;
    }

}
