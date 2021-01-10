// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSClusterLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAKSClusterLogResponseBody body;

    public static UpdateAKSClusterLogResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSClusterLogResponse self = new UpdateAKSClusterLogResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAKSClusterLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAKSClusterLogResponse setBody(UpdateAKSClusterLogResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAKSClusterLogResponseBody getBody() {
        return this.body;
    }

}
