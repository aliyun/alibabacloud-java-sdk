// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReinitMsRcSyncClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReinitMsRcSyncClustersResponseBody body;

    public static ReinitMsRcSyncClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinitMsRcSyncClustersResponse self = new ReinitMsRcSyncClustersResponse();
        return TeaModel.build(map, self);
    }

    public ReinitMsRcSyncClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReinitMsRcSyncClustersResponse setBody(ReinitMsRcSyncClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ReinitMsRcSyncClustersResponseBody getBody() {
        return this.body;
    }

}
