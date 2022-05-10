// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPushAllTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPushAllTaskResponseBody body;

    public static ModifyPushAllTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPushAllTaskResponse self = new ModifyPushAllTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPushAllTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPushAllTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPushAllTaskResponse setBody(ModifyPushAllTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPushAllTaskResponseBody getBody() {
        return this.body;
    }

}
