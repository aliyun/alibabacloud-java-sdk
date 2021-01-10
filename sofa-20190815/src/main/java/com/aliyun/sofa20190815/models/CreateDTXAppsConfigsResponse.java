// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXAppsConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDTXAppsConfigsResponseBody body;

    public static CreateDTXAppsConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXAppsConfigsResponse self = new CreateDTXAppsConfigsResponse();
        return TeaModel.build(map, self);
    }

    public CreateDTXAppsConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDTXAppsConfigsResponse setBody(CreateDTXAppsConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDTXAppsConfigsResponseBody getBody() {
        return this.body;
    }

}
