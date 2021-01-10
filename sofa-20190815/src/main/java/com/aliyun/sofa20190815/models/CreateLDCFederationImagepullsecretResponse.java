// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationImagepullsecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLDCFederationImagepullsecretResponseBody body;

    public static CreateLDCFederationImagepullsecretResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationImagepullsecretResponse self = new CreateLDCFederationImagepullsecretResponse();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationImagepullsecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLDCFederationImagepullsecretResponse setBody(CreateLDCFederationImagepullsecretResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLDCFederationImagepullsecretResponseBody getBody() {
        return this.body;
    }

}
