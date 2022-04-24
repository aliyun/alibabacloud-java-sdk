// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodesParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBNodesParametersResponseBody body;

    public static ModifyDBNodesParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodesParametersResponse self = new ModifyDBNodesParametersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodesParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBNodesParametersResponse setBody(ModifyDBNodesParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBNodesParametersResponseBody getBody() {
        return this.body;
    }

}
