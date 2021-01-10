// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecAKSBuildResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecAKSBuildResponseBody body;

    public static ExecAKSBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAKSBuildResponse self = new ExecAKSBuildResponse();
        return TeaModel.build(map, self);
    }

    public ExecAKSBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecAKSBuildResponse setBody(ExecAKSBuildResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecAKSBuildResponseBody getBody() {
        return this.body;
    }

}
