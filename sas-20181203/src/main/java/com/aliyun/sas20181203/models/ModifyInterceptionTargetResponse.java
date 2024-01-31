// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInterceptionTargetResponseBody body;

    public static ModifyInterceptionTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionTargetResponse self = new ModifyInterceptionTargetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInterceptionTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInterceptionTargetResponse setBody(ModifyInterceptionTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInterceptionTargetResponseBody getBody() {
        return this.body;
    }

}
