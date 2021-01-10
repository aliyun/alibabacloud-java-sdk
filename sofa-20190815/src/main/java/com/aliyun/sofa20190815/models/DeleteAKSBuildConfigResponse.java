// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSBuildConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSBuildConfigResponseBody body;

    public static DeleteAKSBuildConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSBuildConfigResponse self = new DeleteAKSBuildConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSBuildConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSBuildConfigResponse setBody(DeleteAKSBuildConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSBuildConfigResponseBody getBody() {
        return this.body;
    }

}
