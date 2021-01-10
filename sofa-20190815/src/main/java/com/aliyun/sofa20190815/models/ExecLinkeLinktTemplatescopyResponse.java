// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktTemplatescopyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktTemplatescopyResponseBody body;

    public static ExecLinkeLinktTemplatescopyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktTemplatescopyResponse self = new ExecLinkeLinktTemplatescopyResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktTemplatescopyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktTemplatescopyResponse setBody(ExecLinkeLinktTemplatescopyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktTemplatescopyResponseBody getBody() {
        return this.body;
    }

}
