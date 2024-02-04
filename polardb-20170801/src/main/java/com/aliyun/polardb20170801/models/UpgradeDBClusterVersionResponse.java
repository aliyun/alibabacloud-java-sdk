// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeDBClusterVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpgradeDBClusterVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeDBClusterVersionResponse setBody(UpgradeDBClusterVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBClusterVersionResponseBody getBody() {
        return this.body;
    }

}
