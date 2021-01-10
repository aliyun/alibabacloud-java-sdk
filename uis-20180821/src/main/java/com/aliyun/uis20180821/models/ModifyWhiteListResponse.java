// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWhiteListResponseBody body;

    public static ModifyWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhiteListResponse self = new ModifyWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWhiteListResponse setBody(ModifyWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWhiteListResponseBody getBody() {
        return this.body;
    }

}
