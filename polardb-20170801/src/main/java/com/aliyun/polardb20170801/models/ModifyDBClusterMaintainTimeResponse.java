// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMaintainTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterMaintainTimeResponseBody body;

    public static ModifyDBClusterMaintainTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMaintainTimeResponse self = new ModifyDBClusterMaintainTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMaintainTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterMaintainTimeResponse setBody(ModifyDBClusterMaintainTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterMaintainTimeResponseBody getBody() {
        return this.body;
    }

}
