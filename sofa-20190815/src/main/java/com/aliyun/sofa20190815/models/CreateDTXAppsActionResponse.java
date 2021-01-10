// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXAppsActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDTXAppsActionResponseBody body;

    public static CreateDTXAppsActionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXAppsActionResponse self = new CreateDTXAppsActionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDTXAppsActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDTXAppsActionResponse setBody(CreateDTXAppsActionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDTXAppsActionResponseBody getBody() {
        return this.body;
    }

}
