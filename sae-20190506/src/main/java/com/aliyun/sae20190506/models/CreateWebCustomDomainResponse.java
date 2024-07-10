// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateWebCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebCustomDomainBody body;

    public static CreateWebCustomDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebCustomDomainResponse self = new CreateWebCustomDomainResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebCustomDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebCustomDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWebCustomDomainResponse setBody(WebCustomDomainBody body) {
        this.body = body;
        return this;
    }
    public WebCustomDomainBody getBody() {
        return this.body;
    }

}
