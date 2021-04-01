// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class CreateAssetCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAssetCredentialResponseBody body;

    public static CreateAssetCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetCredentialResponse self = new CreateAssetCredentialResponse();
        return TeaModel.build(map, self);
    }

    public CreateAssetCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAssetCredentialResponse setBody(CreateAssetCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAssetCredentialResponseBody getBody() {
        return this.body;
    }

}
