// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeDBClusterMinorVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeDBClusterMinorVersionResponseBody body;

    public static UpgradeDBClusterMinorVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBClusterMinorVersionResponse self = new UpgradeDBClusterMinorVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBClusterMinorVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeDBClusterMinorVersionResponse setBody(UpgradeDBClusterMinorVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBClusterMinorVersionResponseBody getBody() {
        return this.body;
    }

}
