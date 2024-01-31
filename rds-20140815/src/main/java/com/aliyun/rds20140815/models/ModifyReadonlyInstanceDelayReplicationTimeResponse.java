// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadonlyInstanceDelayReplicationTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyReadonlyInstanceDelayReplicationTimeResponseBody body;

    public static ModifyReadonlyInstanceDelayReplicationTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadonlyInstanceDelayReplicationTimeResponse self = new ModifyReadonlyInstanceDelayReplicationTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponse setBody(ModifyReadonlyInstanceDelayReplicationTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReadonlyInstanceDelayReplicationTimeResponseBody getBody() {
        return this.body;
    }

}
