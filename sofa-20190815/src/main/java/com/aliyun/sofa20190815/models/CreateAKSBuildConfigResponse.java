// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSBuildConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSBuildConfigResponseBody body;

    public static CreateAKSBuildConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSBuildConfigResponse self = new CreateAKSBuildConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSBuildConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSBuildConfigResponse setBody(CreateAKSBuildConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSBuildConfigResponseBody getBody() {
        return this.body;
    }

}
