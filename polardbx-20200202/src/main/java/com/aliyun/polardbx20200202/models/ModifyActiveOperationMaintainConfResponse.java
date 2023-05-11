// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyActiveOperationMaintainConfResponseBody body;

    public static ModifyActiveOperationMaintainConfResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintainConfResponse self = new ModifyActiveOperationMaintainConfResponse();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintainConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyActiveOperationMaintainConfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyActiveOperationMaintainConfResponse setBody(ModifyActiveOperationMaintainConfResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyActiveOperationMaintainConfResponseBody getBody() {
        return this.body;
    }

}
