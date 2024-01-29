// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CancelChangeAccountEmailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelChangeAccountEmailResponseBody body;

    public static CancelChangeAccountEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelChangeAccountEmailResponse self = new CancelChangeAccountEmailResponse();
        return TeaModel.build(map, self);
    }

    public CancelChangeAccountEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelChangeAccountEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelChangeAccountEmailResponse setBody(CancelChangeAccountEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelChangeAccountEmailResponseBody getBody() {
        return this.body;
    }

}
