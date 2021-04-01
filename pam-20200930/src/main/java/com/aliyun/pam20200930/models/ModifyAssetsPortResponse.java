// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class ModifyAssetsPortResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAssetsPortResponseBody body;

    public static ModifyAssetsPortResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAssetsPortResponse self = new ModifyAssetsPortResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAssetsPortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAssetsPortResponse setBody(ModifyAssetsPortResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAssetsPortResponseBody getBody() {
        return this.body;
    }

}
