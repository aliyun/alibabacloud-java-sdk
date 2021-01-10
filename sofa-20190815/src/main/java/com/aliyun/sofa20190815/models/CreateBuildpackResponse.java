// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateBuildpackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBuildpackResponseBody body;

    public static CreateBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpackResponse self = new CreateBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public CreateBuildpackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBuildpackResponse setBody(CreateBuildpackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBuildpackResponseBody getBody() {
        return this.body;
    }

}
