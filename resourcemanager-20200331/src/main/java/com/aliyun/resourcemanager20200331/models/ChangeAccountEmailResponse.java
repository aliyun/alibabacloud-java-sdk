// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ChangeAccountEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeAccountEmailResponseBody body;

    public static ChangeAccountEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAccountEmailResponse self = new ChangeAccountEmailResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAccountEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeAccountEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeAccountEmailResponse setBody(ChangeAccountEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeAccountEmailResponseBody getBody() {
        return this.body;
    }

}
