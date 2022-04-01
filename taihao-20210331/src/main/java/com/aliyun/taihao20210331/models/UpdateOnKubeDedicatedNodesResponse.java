// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateOnKubeDedicatedNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOnKubeDedicatedNodesResponseBody body;

    public static UpdateOnKubeDedicatedNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnKubeDedicatedNodesResponse self = new UpdateOnKubeDedicatedNodesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOnKubeDedicatedNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOnKubeDedicatedNodesResponse setBody(UpdateOnKubeDedicatedNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOnKubeDedicatedNodesResponseBody getBody() {
        return this.body;
    }

}
