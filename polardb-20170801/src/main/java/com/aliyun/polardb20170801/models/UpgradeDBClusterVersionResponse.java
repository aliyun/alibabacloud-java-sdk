// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeDBClusterVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeDBClusterVersionResponseBody body;

    public static UpgradeDBClusterVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBClusterVersionResponse self = new UpgradeDBClusterVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBClusterVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeDBClusterVersionResponse setBody(UpgradeDBClusterVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBClusterVersionResponseBody getBody() {
        return this.body;
    }

}
