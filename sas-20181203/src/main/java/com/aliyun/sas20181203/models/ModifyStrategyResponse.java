// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyStrategyResponseBody body;

    public static ModifyStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStrategyResponse self = new ModifyStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStrategyResponse setBody(ModifyStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStrategyResponseBody getBody() {
        return this.body;
    }

}
