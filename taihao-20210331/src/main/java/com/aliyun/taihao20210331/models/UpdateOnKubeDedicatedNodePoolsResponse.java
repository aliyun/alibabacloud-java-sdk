// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateOnKubeDedicatedNodePoolsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOnKubeDedicatedNodePoolsResponseBody body;

    public static UpdateOnKubeDedicatedNodePoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnKubeDedicatedNodePoolsResponse self = new UpdateOnKubeDedicatedNodePoolsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOnKubeDedicatedNodePoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOnKubeDedicatedNodePoolsResponse setBody(UpdateOnKubeDedicatedNodePoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOnKubeDedicatedNodePoolsResponseBody getBody() {
        return this.body;
    }

}
