// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDTXAppsResponseBody body;

    public static CreateDTXAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXAppsResponse self = new CreateDTXAppsResponse();
        return TeaModel.build(map, self);
    }

    public CreateDTXAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDTXAppsResponse setBody(CreateDTXAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDTXAppsResponseBody getBody() {
        return this.body;
    }

}
