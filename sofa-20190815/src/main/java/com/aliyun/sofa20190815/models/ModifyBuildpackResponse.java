// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ModifyBuildpackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBuildpackResponseBody body;

    public static ModifyBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBuildpackResponse self = new ModifyBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBuildpackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBuildpackResponse setBody(ModifyBuildpackResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBuildpackResponseBody getBody() {
        return this.body;
    }

}
