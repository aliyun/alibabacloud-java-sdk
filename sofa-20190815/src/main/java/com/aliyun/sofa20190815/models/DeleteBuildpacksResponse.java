// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteBuildpacksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBuildpacksResponseBody body;

    public static DeleteBuildpacksResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBuildpacksResponse self = new DeleteBuildpacksResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBuildpacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBuildpacksResponse setBody(DeleteBuildpacksResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBuildpacksResponseBody getBody() {
        return this.body;
    }

}
