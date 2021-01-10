// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSBuildConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAKSBuildConfigResponseBody body;

    public static UpdateAKSBuildConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSBuildConfigResponse self = new UpdateAKSBuildConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAKSBuildConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAKSBuildConfigResponse setBody(UpdateAKSBuildConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAKSBuildConfigResponseBody getBody() {
        return this.body;
    }

}
