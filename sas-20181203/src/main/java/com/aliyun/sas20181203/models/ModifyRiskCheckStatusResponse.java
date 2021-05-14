// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyRiskCheckStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRiskCheckStatusResponseBody body;

    public static ModifyRiskCheckStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRiskCheckStatusResponse self = new ModifyRiskCheckStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRiskCheckStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRiskCheckStatusResponse setBody(ModifyRiskCheckStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRiskCheckStatusResponseBody getBody() {
        return this.body;
    }

}
