// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DeleteDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDomainResponseBody body;

    public static DeleteDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainResponse self = new DeleteDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDomainResponse setBody(DeleteDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainResponseBody getBody() {
        return this.body;
    }

}
