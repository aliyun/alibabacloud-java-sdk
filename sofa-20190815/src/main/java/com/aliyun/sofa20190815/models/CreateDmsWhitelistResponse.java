// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDmsWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDmsWhitelistResponseBody body;

    public static CreateDmsWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDmsWhitelistResponse self = new CreateDmsWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public CreateDmsWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDmsWhitelistResponse setBody(CreateDmsWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDmsWhitelistResponseBody getBody() {
        return this.body;
    }

}
