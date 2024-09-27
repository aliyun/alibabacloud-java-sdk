// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ModifyReplicationJobAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyReplicationJobAttributeResponseBody body;

    public static ModifyReplicationJobAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReplicationJobAttributeResponse self = new ModifyReplicationJobAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReplicationJobAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReplicationJobAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyReplicationJobAttributeResponse setBody(ModifyReplicationJobAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReplicationJobAttributeResponseBody getBody() {
        return this.body;
    }

}
