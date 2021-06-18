// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyStrategyTargetResponseBody body;

    public static ModifyStrategyTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStrategyTargetResponse self = new ModifyStrategyTargetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStrategyTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStrategyTargetResponse setBody(ModifyStrategyTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStrategyTargetResponseBody getBody() {
        return this.body;
    }

}
