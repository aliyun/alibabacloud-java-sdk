// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDWSMetadataLogictablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDWSMetadataLogictablesResponseBody body;

    public static CreateDWSMetadataLogictablesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDWSMetadataLogictablesResponse self = new CreateDWSMetadataLogictablesResponse();
        return TeaModel.build(map, self);
    }

    public CreateDWSMetadataLogictablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDWSMetadataLogictablesResponse setBody(CreateDWSMetadataLogictablesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDWSMetadataLogictablesResponseBody getBody() {
        return this.body;
    }

}
