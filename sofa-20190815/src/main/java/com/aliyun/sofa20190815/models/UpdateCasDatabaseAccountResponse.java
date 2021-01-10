// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateCasDatabaseAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCasDatabaseAccountResponseBody body;

    public static UpdateCasDatabaseAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasDatabaseAccountResponse self = new UpdateCasDatabaseAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCasDatabaseAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCasDatabaseAccountResponse setBody(UpdateCasDatabaseAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCasDatabaseAccountResponseBody getBody() {
        return this.body;
    }

}
