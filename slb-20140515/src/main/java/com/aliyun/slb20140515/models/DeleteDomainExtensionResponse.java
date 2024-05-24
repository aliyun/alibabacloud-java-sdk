// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteDomainExtensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDomainExtensionResponseBody body;

    public static DeleteDomainExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainExtensionResponse self = new DeleteDomainExtensionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDomainExtensionResponse setBody(DeleteDomainExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainExtensionResponseBody getBody() {
        return this.body;
    }

}
