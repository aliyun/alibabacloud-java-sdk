// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceDescriptionResponseBody body;

    public static ModifyDBInstanceDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDescriptionResponse self = new ModifyDBInstanceDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceDescriptionResponse setBody(ModifyDBInstanceDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceDescriptionResponseBody getBody() {
        return this.body;
    }

}
