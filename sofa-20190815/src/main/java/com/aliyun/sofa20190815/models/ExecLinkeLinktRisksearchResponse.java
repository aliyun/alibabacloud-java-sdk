// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktRisksearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktRisksearchResponseBody body;

    public static ExecLinkeLinktRisksearchResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktRisksearchResponse self = new ExecLinkeLinktRisksearchResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktRisksearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktRisksearchResponse setBody(ExecLinkeLinktRisksearchResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktRisksearchResponseBody getBody() {
        return this.body;
    }

}
