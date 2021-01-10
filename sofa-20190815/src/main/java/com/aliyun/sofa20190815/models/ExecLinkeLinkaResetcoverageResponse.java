// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinkaResetcoverageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinkaResetcoverageResponseBody body;

    public static ExecLinkeLinkaResetcoverageResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinkaResetcoverageResponse self = new ExecLinkeLinkaResetcoverageResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinkaResetcoverageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinkaResetcoverageResponse setBody(ExecLinkeLinkaResetcoverageResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinkaResetcoverageResponseBody getBody() {
        return this.body;
    }

}
