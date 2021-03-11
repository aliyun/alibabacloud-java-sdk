// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyParentPlatformResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyParentPlatformResponseBody body;

    public static ModifyParentPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyParentPlatformResponse self = new ModifyParentPlatformResponse();
        return TeaModel.build(map, self);
    }

    public ModifyParentPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyParentPlatformResponse setBody(ModifyParentPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyParentPlatformResponseBody getBody() {
        return this.body;
    }

}
