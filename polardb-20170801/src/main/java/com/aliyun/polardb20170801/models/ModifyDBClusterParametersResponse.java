// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterParametersResponseBody body;

    public static ModifyDBClusterParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterParametersResponse self = new ModifyDBClusterParametersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterParametersResponse setBody(ModifyDBClusterParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterParametersResponseBody getBody() {
        return this.body;
    }

}
