// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyFirstRankResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFirstRankResponseBody body;

    public static ModifyFirstRankResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirstRankResponse self = new ModifyFirstRankResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFirstRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFirstRankResponse setBody(ModifyFirstRankResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFirstRankResponseBody getBody() {
        return this.body;
    }

}
